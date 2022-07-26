package org.generation.demo;

public class Producto {

	private String nombre;
	private String descripcion;
	private String URL_imagen;
	private double precio;
	private int id;
	private static int total = 0;
	public Producto(String nombre, String descripcion, String uRL_imagen, double precio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.URL_imagen = uRL_imagen;
		this.precio = precio;
		total ++;
		this.id=total;
	}//constructor
	
public Producto() {
	total ++;
	this.id=total;
}//constructorDefault, NO necesario con la base de datos


public int getId() {
	return id;
}//getId

public String getNombre() {
	return nombre;
}//getNombre
public void setNombre(String nombre) {
	this.nombre = nombre;
}//setNombre
public String getDescripcion() {
	return descripcion;
}//getDescripcion
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}//setDescripcion
public String getURL_imagen() {
	return URL_imagen;
}//getURL_image
public void setURL_imagen(String uRL_imagen) {
	URL_imagen = uRL_imagen;
}//setURL_image
public double getPrecio() {
	return precio;
}//getPrecio
public void setPrecio(double precio) {
	this.precio = precio;
}//setPrecio

@Override
public String toString() {
	return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", URL_image=" + URL_imagen + ", precio="
			+ precio + "]";
}
	
	



}
