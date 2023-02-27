package com.peliculas.controlador;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peliculas.modelo.Rol;
import com.peliculas.modelo.Usuario;
import com.peliculas.modelo.UsuarioRol;
import com.peliculas.servicios.UsuarioService;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	
	//metodo para guardar Usuarios, rol, usuarioRol
	@PostMapping("/")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) throws Exception {
		
		if(usuario.getNombre_completo() == null || usuario.getNombre_completo().isEmpty()) {
			System.out.println("error nombre completo viene vacio");
		}
		
		usuario.setPerfil("default.png");
		Set<UsuarioRol> roles =  new HashSet<>();
		
		Rol rol = new Rol();
		rol.setRolId(2);
		rol.setNombre("NORMAL");
		
		
		UsuarioRol usuarioRol = new UsuarioRol();
		usuarioRol.setUsuario(usuario);
		usuarioRol.setRol(rol);
		
		return usuarioService.guardarUsuario(usuario, roles);
		
	}
	
	//metodo para buscar u obtener la informacion del usuario por su nombre
	@GetMapping("/{username}")
	public Usuario obtenerUsuario( @PathVariable("username") String username) {
		return usuarioService.obtenerUsuario(username);
	}
	
	
	//eliminar usuario por id
	@DeleteMapping("/{idUsuario}") 
	public void eliminarUsuario(@PathVariable("idUsuario") Long idUsuario ) {
		usuarioService.eliminarUsuario(idUsuario);
	}

}
