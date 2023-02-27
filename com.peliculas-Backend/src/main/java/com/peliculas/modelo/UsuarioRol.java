package com.peliculas.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
public class UsuarioRol {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer usuarioRolId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	
	private Usuario usuario;
	
	
	@ManyToOne
	private  Rol rol;


	public Integer getUsuarioRolId() {
		return usuarioRolId;
	}


	public void setUsuarioRolId(Integer usuarioRolId) {
		this.usuarioRolId = usuarioRolId;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Rol getRol() {
		return rol;
	}


	public void setRol(Rol rol) {
		this.rol = rol;
	}


	public UsuarioRol() {
		
	}


	public UsuarioRol(Integer usuarioRolId, Usuario usuario, Rol rol) {
		super();
		this.usuarioRolId = usuarioRolId;
		this.usuario = usuario;
		this.rol = rol;
	}
	
	
	
	
	

}
