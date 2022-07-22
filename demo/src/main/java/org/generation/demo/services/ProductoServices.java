package org.generation.demo.services;

import java.util.ArrayList;
import java.util.Arrays;

import org.generation.demo.Producto;
import org.springframework.stereotype.Service;

@Service
public class ProductoServices {
	public final ArrayList<Producto> lista = new ArrayList<Producto>();
	
	public ProductoServices() {
		lista.add(new Producto ("Plumon tinta fugaz", "Plumon tinta fugaz color verde para pintarrón",
				"PlumonVerde.jpg", 25.0));
		lista.add(new Producto ("Borrador pintarrón", "Borrador para pintarrón de tinta fugaz",
				"borradorB.jpg", 45.0));
		lista.add(new Producto ("Cuaderno profesional cuadro chico", "Cuaderno profesional cuadro chico Norma",
				"normaCuadroChico.jpg", 78.0));
		//Opcios2: lista = Arrays.asList(new Producto(), new Producto(), new Producto());
		//Opcion1: lista.add(new Product())
	}//constructor
	
	public ArrayList<Producto> getProductos(){
		return lista;
	}//getProdcutos
	
	public Producto getProducto(Long id) {
		Producto tmpProd = null;
		for (Producto producto : lista) {
			if (producto.getId()==id) {
				tmpProd = producto;
				break;
			}//if
		}//forEach
		return tmpProd;
	}//getProducto

	public Producto deleteProducto(Long id) {
		Producto tmpProd = null;
		for (Producto producto : lista) {
			if (producto.getId()==id) {
				tmpProd = lista.remove(lista.indexOf(producto));
				break;
			}//if
		}//forEach
		return tmpProd;
	}//deleteProducto

	public Producto addProducto(Producto producto) {
		lista.add(producto);
		return producto;
	}//addProdcuto
//Es un dato primitivo, por lo que no se puede comparar con null								  double	
	public Producto updateProducto(Long id, String nombre, String descripcion, String URL_imagen, Double precio) {
		Producto tmpProd = null;
		for (Producto producto : lista) {
			if (producto.getId()==id) {
				if(nombre!=null) producto.setNombre(nombre);
				if(descripcion!=null) producto.setDescripcion(descripcion);
				if(URL_imagen!=null) producto.setURL_imagen(URL_imagen);
//				if(precio>0) producto.setPrecio(precio);
				if(precio!=null) producto.setPrecio(precio.doubleValue());
				tmpProd = lista.remove(lista.indexOf(producto));
				break;
			}//if
		}//forEach
		return tmpProd;
	}
	
}//classProductoServices
