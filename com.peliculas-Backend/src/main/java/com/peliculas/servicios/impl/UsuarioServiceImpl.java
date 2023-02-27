package com.peliculas.servicios.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peliculas.modelo.Usuario;
import com.peliculas.modelo.UsuarioRol;
import com.peliculas.repositorio.RolRepository;
import com.peliculas.repositorio.UsuarioRepository;
import com.peliculas.servicios.UsuarioService;
import com.peliculas.modelo.Rol;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	//aqui se implementan todos los servicios hechos el usuario service
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired 
	private RolRepository rolRepository;
	
	
	
		
	@Override
	public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {
		
		Usuario usuarioLocal = usuarioRepository.findByUsername(usuario.getUsername());
		
		if (usuarioLocal != null) {
			System.out.println("El usuario ya existe");
			
			throw new Exception("El usuario ya esta presente");
		}
		else {
			
			for(UsuarioRol usuarioRol: usuarioRoles) {
				rolRepository.save(usuarioRol.getRol());
			}
			
			usuario.getUsuarioRoles().addAll(usuarioRoles);
			usuarioLocal = usuarioRepository.save(usuario);
			
		}
		
		return usuarioLocal;
	}




	@Override
	public Usuario obtenerUsuario(String username) {
		// TODO Auto-generated method stub
		
		return usuarioRepository.findByUsername(username);
	}




	@Override
	public void eliminarUsuario(Long id_usuario) {
		// TODO Auto-generated method stub
		
		usuarioRepository.deleteById(id_usuario);
		
	}
	
	

}
