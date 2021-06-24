package com.druggelp.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.druggelp.security.entity.Usuario;
import com.druggelp.security.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
		return usuarioRepository.findByNombreUsuario(nombreUsuario);
	}
	
	private boolean existsByNombreUsuario(String nombreUsuario){
		return usuarioRepository.existsByNombreUsuario(nombreUsuario);
	}
	
	private boolean existsByEmail(String email){
		return usuarioRepository.existsByEmail(email);
	}
	
	public void save(Usuario usuario){
		usuarioRepository.save(usuario);
	}
}
