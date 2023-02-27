package com.peliculas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.peliculas.modelo.Peliculas;

@Repository
public interface PeliculasRepositorio extends JpaRepository<Peliculas, Integer>{
	

}
