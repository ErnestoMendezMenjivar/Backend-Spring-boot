package com.peliculas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peliculas.modelo.Rol;

public interface RolRepository  extends JpaRepository<Rol, Long>{

}
