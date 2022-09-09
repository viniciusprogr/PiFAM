package com.web.template.converts;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.web.template.dto.inputs.CadastraUsuarioInput;
import com.web.template.dto.outputs.UsuarioOuput;
import com.web.template.entities.UsuarioEntity;

@Component
public class UsuarioConvert {

	@Autowired
	private ModelMapper modelMapper;

	public UsuarioEntity inputToNewEntity(CadastraUsuarioInput cadastraUsuarioInput) {
		return modelMapper.map(cadastraUsuarioInput, UsuarioEntity.class);
	}

	public UsuarioOuput entityToOutput(UsuarioEntity usuarioEntity) {
		return modelMapper.map(usuarioEntity, UsuarioOuput.class);
	}
	

}
