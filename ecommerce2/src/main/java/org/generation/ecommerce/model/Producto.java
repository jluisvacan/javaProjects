package org.generation.ecommerce.model;

import javax.persistence.*;

@Entity
@Table(name="producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private Long id;
	private String nombre;
	private String descripcion;
	@Column(name="url_imagen")
	private String URL_imagen;
	@Column(name="precio", nullable= false)
	private double precio;
	
	
	
	public Producto(Long id, String nombre, String descripcion, String uRL_imagen, double precio) {
		super();
		this.id=id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		URL_imagen = uRL_imagen;
		this.precio = precio;
	}// constructor

	public Producto() {
		
	} // constructor default
	
	public Long getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getURL_imagen() {
		return URL_imagen;
	}

	public void setURL_imagen(String uRL_imagen) {
		URL_imagen = uRL_imagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", URL_imagen="
				+ URL_imagen + ", precio=" + precio + "]";
	}
	
	
}// class Producto
