package com.peliculas.modelo;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Rol {
	
	@Id 
	private Integer rolId;
	
	private String nombre;
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "rol")
	private Set<UsuarioRol>usuarioRoles = new HashSet<>();


	public Rol() {
		
	}


	public Rol(Integer rolId, String nombre, Set<UsuarioRol> usuarioRoles) {
		this.rolId = rolId;
		this.nombre = nombre;
		this.usuarioRoles = usuarioRoles;
	}


	public Integer getRolId() {
		return rolId;
	}


	public void setRolId(Integer rolId) {
		this.rolId = rolId;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Set<UsuarioRol> getUsuarioRoles() {
		return usuarioRoles;
	}


	public void setUsuarioRoles(Set<UsuarioRol> usuarioRoles) {
		this.usuarioRoles = usuarioRoles;
	}
	
	
	

}
