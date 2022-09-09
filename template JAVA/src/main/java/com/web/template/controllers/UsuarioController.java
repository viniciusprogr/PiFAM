package com.web.template.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.template.configs.ControllerConfig;
import com.web.template.converts.UsuarioConvert;
import com.web.template.dto.inputs.CadastraUsuarioInput;
import com.web.template.dto.outputs.UsuarioOuput;
import com.web.template.entities.UsuarioEntity;
import com.web.template.services.UsuarioService;

@RestController
@RequestMapping(ControllerConfig.URL_API + "/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioConvert usuarioConvert ;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping
	public UsuarioOuput cadastrarUsuario(@RequestBody CadastraUsuarioInput cadastraUsuarioInput) {
		
		UsuarioEntity usuarioEntity = usuarioConvert.inputToNewEntity(cadastraUsuarioInput);
		
		UsuarioEntity usuarioCriado = usuarioService.cria(usuarioEntity);
		
		return usuarioConvert.entityToOutput(usuarioCriado);
	}
	
	

}
