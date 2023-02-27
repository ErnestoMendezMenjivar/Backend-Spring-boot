package com.peliculas;

import com.peliculas.modelo.Rol;
import com.peliculas.modelo.Usuario;
import com.peliculas.modelo.UsuarioRol;
import com.peliculas.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario usuario = new Usuario();

		/*usuario.setNombre_Completo("duglas ernesto mendez");
		usuario.setCorreo("duglas@gmail.com");
		usuario.setUsername("ernesto");
		usuario.setContrasena("12345");
		usuario.setPerfil("foto.png");

		Rol rol = new Rol();
		rol.setRolId(1);
		rol.setNombre("ADMIN");

		Set<UsuarioRol> usuarioRoles = new HashSet<>();
		UsuarioRol usuarioRol = new UsuarioRol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);

		usuarioRoles.add(usuarioRol);

		Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario,usuarioRoles);

		System.out.println(usuarioGuardado.getUsername()); */

	}
}
