package org.generation.ecommerce.controller;

import java.util.*;

import org.generation.ecommerce.model.Producto;
import org.generation.ecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (path="/api/products/")
public class ProductoController {
	
	private final ProductoService productoService;
	
	@Autowired
	public ProductoController(ProductoService productoService) {
		this.productoService = productoService;
	}// constructor default
	
	//CRUD
	@GetMapping
	public List<Producto> getAllProducts(){
		return productoService.getProductos();
	}// getAllProducts
	
	@GetMapping(path="{prodId}")
	public Producto getProducto(@PathVariable("prodId")Long id){
		return productoService.getProducto(id);
	}// getProduct
	
	@DeleteMapping(path="{prodId}")
	public Producto deleteProducto(@PathVariable("prodId")Long id){
		return productoService.deleteProducto(id);
	}// deleteProducto
	
	@PostMapping
	public Producto addProducto(@RequestBody Producto producto){
		return productoService.addProducto(producto);
	}// getAllProducts
	
	@PutMapping(path="{prodId}")
	public Producto updateProducto(@PathVariable("prodId")Long id,
			@RequestParam(required = false) String nombre,
			@RequestParam(required = false) String descripcion,
			@RequestParam(required = false) String URL_imagen,
			@RequestParam(required = false) Double precio) {
		return productoService.updateProducto(id, nombre, descripcion, URL_imagen, precio);
	}// updateProducto
	
}// class productoController
