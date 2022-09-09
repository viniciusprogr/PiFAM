package com.web.template.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.template.entities.UsuarioEntity;
import com.web.template.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public UsuarioEntity cria(UsuarioEntity usuarioEntity) {
		
		return usuarioRepository.save(usuarioEntity);
	}
	
	

}
