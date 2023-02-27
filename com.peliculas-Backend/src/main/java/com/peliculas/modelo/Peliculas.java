package com.peliculas.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="peliculas")
public class Peliculas {

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer id_pelicula;

	  @Column(name = "titulo")
	  private String titulo;

	  @Column(name = "descripcion")
	  private String descripcion;

	  @Column(name = "imagen")
	  private String imagen;
	  
	  @Column(name = "stock")
	  private Integer stock;
	  
	  @Column(name = "tiempo")
	  private String tiempo;
	  
	  @Column(name = "precio_alquiler")
	  private Integer precio_alquiler;
	  
	  @Column(name = "precio_venta")
	  private Integer precio_venta;
	  
	  @Column(name = "disponibilidad")
	  private Integer disponibilidad;

	  
	public Peliculas() {
		
	}


	public Peliculas(Integer id_pelicula, String titulo, String descripcion, String imagen, Integer stock,String tiempo,
			Integer precio_alquiler, Integer precio_venta, Integer disponibilidad) {
		super();
		this.id_pelicula = id_pelicula;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.stock = stock;
		this.tiempo = tiempo;
		this.precio_alquiler = precio_alquiler;
		this.precio_venta = precio_venta;
		this.disponibilidad = disponibilidad;
	}


	public Integer getId_pelicula() {
		return id_pelicula;
	}


	public void setId_pelicula(Integer id_pelicula) {
		this.id_pelicula = id_pelicula;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	
	
	

	public String getTiempo() {
		return tiempo;
	}


	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}


	public Integer getPrecio_alquiler() {
		return precio_alquiler;
	}


	public void setPrecio_alquiler(Integer precio_alquiler) {
		this.precio_alquiler = precio_alquiler;
	}


	public Integer getPrecio_venta() {
		return precio_venta;
	}


	public void setPrecio_venta(Integer precio_venta) {
		this.precio_venta = precio_venta;
	}


	public Integer getDisponibilidad() {
		return disponibilidad;
	}


	public void setDisponibilidad(Integer disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	
	  
	
	  @Override
	  public String toString() {
	    return "Tutorial [id_pelicula=" + id_pelicula + ", titulo=" + titulo + ", descripcion=" + descripcion + ", imagen=" + imagen + ", stock=" + stock + ",tiempo=" + tiempo + ", precio_alquiler=" + precio_alquiler + ", precio_venta=" + precio_venta + ", disponibilidad=" + disponibilidad + " ]";
	  }
	  
	
}
