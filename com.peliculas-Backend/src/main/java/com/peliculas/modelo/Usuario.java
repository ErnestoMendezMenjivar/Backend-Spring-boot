package com.peliculas.modelo;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario;
	
	
	
	@Column(name = "nombre_completo")
	private String nombre_completo;
	
	@Column(name = "correo")
	private String correo;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "contrasena")
	private String contrasena;
	
	
	@Column(name = "enabled")
	private boolean enabled = true;
	
	@Column(name = "perfil")
	private String perfil;
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "usuario")
	@JsonIgnore
	private Set<UsuarioRol> usuarioRoles = new HashSet<>();


	public Usuario() {
		
	}


	public Usuario(Long id_usuario, String nombre_completo, String correo, String username, String contrasena,
			boolean enabled, String perfil, Set<UsuarioRol> usuarioRoles) {
		this.id_usuario = id_usuario;
		this.nombre_completo = nombre_completo;
		this.correo = correo;
		this.username = username;
		this.contrasena = contrasena;
		this.enabled = enabled;
		this.perfil = perfil;
		this.usuarioRoles = usuarioRoles;
	}


	public Long getId_usuario() {
		return id_usuario;
	}


	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}


	public String getNombre_completo() {
		return nombre_completo;
	}


	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	public boolean isEnabled() {
		return enabled;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


	public String getPerfil() {
		return perfil;
	}


	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}


	public Set<UsuarioRol> getUsuarioRoles() {
		return usuarioRoles;
	}


	public void setUsuarioRoles(Set<UsuarioRol> usuarioRoles) {
		this.usuarioRoles = usuarioRoles;
	}
	
	
	

	

	/*@Override
	  public String toString() {
	    return "Tutorial [id_usuario=" + id_usuario + ", nombre_completo=" + nombre_completo + ", correo=" + correo + ", username=" + username + ", contrasena=" + contrasena + ", enabled= " + enabled + ", perfil =" + perfil + " ]";
	  }*/
	
	

}
