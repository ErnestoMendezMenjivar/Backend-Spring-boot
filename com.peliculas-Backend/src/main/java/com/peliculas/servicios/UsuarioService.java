package com.peliculas.servicios;

import java.util.Set;

import com.peliculas.modelo.Usuario;
import com.peliculas.modelo.UsuarioRol;

public interface UsuarioService {
	
	
	public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;
	
	public Usuario obtenerUsuario(String username);
	
	public void eliminarUsuario(Long id_usuario);
	
	
	
	
}
