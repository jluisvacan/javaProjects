package org.generation.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.generation.ecommerce.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductoService {
	private final ProductoRepository productoRepository;
	
	@Autowired
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}//constructor
	
	public List<Producto> getProductos() {
		return productoRepository.findAll();
	}//getProductos
	
	public Producto getProducto(Long id) {
		return productoRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("El producto con el id "+ id + " no existe.")
				);
	}//getProducto
	
	// Se asegura de que existe, y ya no agregamos la exepcion orElseThrow
	public Producto deleteProducto(Long id) {
		Producto tmpProd = null;
		if(productoRepository.existsById(id)){
			tmpProd = productoRepository.findById(id).get();
			productoRepository.deleteById(id);
		}//ifExist
		return tmpProd;
	}//deleteProducto
	
	public Producto addProducto(Producto producto){
		Producto tmpProd = null;
		Optional<Producto> prodByName = productoRepository.findByNombre(producto.getNombre());
		if(prodByName.isPresent()) {
			throw new IllegalArgumentException("El producto con el nombre ["+ producto.getNombre() + "] ya existe.");
		} else {
			productoRepository.save(producto);
			tmpProd = producto;
		}//else //ifIsPresent
		return producto;
	}//addProducto
	
	public Producto updateProducto(Long id, String nombre, String descripcion, String uRL_imagen, Double precio) {
		System.out.println(nombre);
		Producto tmpProd= null;
		if(productoRepository.existsById(id)) {
			tmpProd = productoRepository.findById(id).get();
			if(nombre!=null) tmpProd.setNombre(nombre);
			if(descripcion!=null) tmpProd.setDescripcion(descripcion);
			if(uRL_imagen!=null) tmpProd.setURL_imagen(uRL_imagen);
			if(precio!=null) tmpProd.setPrecio(precio.doubleValue());
			productoRepository.save(tmpProd);
			
		} else {
			System.out.println("El producto con el id "+ id+ " no existe");
		}//if
		return tmpProd;
	}//updateProducto
	
	
}//class ProductoService
