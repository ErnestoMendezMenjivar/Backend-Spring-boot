package com.peliculas.controlador;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peliculas.excepciones.ResourceNotFoundException;
import com.peliculas.modelo.Peliculas;
import com.peliculas.repositorio.PeliculasRepositorio;

@RestController
@RequestMapping("/api/v2/")
@CrossOrigin(origins = "*")
public class PeliculasController {
	
	

	@Autowired
	private PeliculasRepositorio peliculasRepositorio;
	
	
	//metodo para listar todas las peliculas
	@GetMapping("/peliculas")
	public List<Peliculas> ListarPeliculas(){
		return peliculasRepositorio.findAll();
	}
	
	
	//metodo para guardar peliculas
	@PostMapping("/peliculas")
	public Peliculas guardarPelicula(@RequestBody Peliculas peliculas) {
			
		return peliculasRepositorio.save(peliculas);
	}
	
	
	//metodo para buscar peliculas por ID
	@GetMapping("/peliculas/{id_pelicula}")
	public ResponseEntity<Peliculas> ObtenerPeliculaPorId(@PathVariable Integer id_pelicula){
		Peliculas peliculas = peliculasRepositorio.findById(id_pelicula).orElseThrow(()-> new ResourceNotFoundException("No existe la pelicula con el ID : " + id_pelicula));
		return ResponseEntity.ok(peliculas);
				
	}
	
	@PutMapping("/peliculas/{id_pelicula}")
	public ResponseEntity<Peliculas> actualizarPelicula(@PathVariable Integer id_pelicula,@RequestBody Peliculas detallesPelicula){
		Peliculas peliculas = peliculasRepositorio.findById(id_pelicula).orElseThrow(()-> new ResourceNotFoundException("No existe la pelicula con el ID : " + id_pelicula));
		
		peliculas.setTitulo(detallesPelicula.getTitulo());
		peliculas.setDescripcion(detallesPelicula.getDescripcion());
		peliculas.setImagen(detallesPelicula.getImagen());
		peliculas.setStock(detallesPelicula.getStock());
		peliculas.setTiempo(detallesPelicula.getTiempo());
		peliculas.setPrecio_alquiler(detallesPelicula.getPrecio_alquiler());
		peliculas.setPrecio_venta(detallesPelicula.getPrecio_venta());
		peliculas.setDisponibilidad(detallesPelicula.getDisponibilidad());
		
		Peliculas peliculaActualizada = peliculasRepositorio.save(peliculas);
		
		return ResponseEntity.ok(peliculaActualizada);
				
	}
	
	
	
	//metodo para eliminar peliculas por Id
	@DeleteMapping("/peliculas/{id_pelicula}")
	public ResponseEntity<Map<String , Boolean>> EliminarPelicula(@PathVariable Integer id_pelicula){
		Peliculas peliculas = peliculasRepositorio.findById(id_pelicula)
		.orElseThrow(()-> new ResourceNotFoundException("No existe la pelicula con el Id: " + id_pelicula));
		
		peliculasRepositorio.delete(peliculas);
		Map<String, Boolean> respuesta = new HashMap<>();
		respuesta.put("Eliminar", Boolean.TRUE);
		return ResponseEntity.ok(respuesta);
		
	}
	
	
	
}
