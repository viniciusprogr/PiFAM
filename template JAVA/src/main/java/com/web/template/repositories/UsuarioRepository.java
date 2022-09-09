package com.web.template.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.template.entities.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
	
	

}
