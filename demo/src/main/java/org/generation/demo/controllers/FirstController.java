package org.generation.demo.controllers;

import java.util.ArrayList;

import org.generation.demo.Producto;
import org.generation.demo.services.ProductoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController 
@RequestMapping(path="/api/products/")
// RestController indica que se trata de un controlador, que recibira solicitudes y dara respuestas
//@CrossOrigin (origins = {"https://127.0.01:5500","https://127.0.01:5500")
//@CrossOrigin (origins= "*", methods= {RequestMethod.GET, RequestMethod.POST)
@CrossOrigin(origins= "*")
public class FirstController {
	
	private final ProductoServices productoServices;
	
	@Autowired
	public FirstController(ProductoServices productoServices) {
	this.productoServices = productoServices;
}//constructor

	@GetMapping
	public ArrayList<Producto> getAllProducts(){
		return productoServices.getProductos();
	}//getAllProducts
	
//	@GetMapping("/ch13/")
//	public String inicio() {
//		return "CH13 rules!! ";
//	}//inicio
	
//	@GetMapping
//	public Producto product() {
//		return new Producto("Cuadreno de doble raya","Cuaderno de doble raya 100 hojas", "cuadernoderaya.png", 34.50);
//	}//product
	@GetMapping (path = "{prodId}")
	public Producto	getProduct(@PathVariable("prodId") Long id) {
		return productoServices.getProducto(id);
	}//getOneProduct
	
	
	@DeleteMapping (path = "{prodId}")
	public Producto	deleteProduct(@PathVariable("prodId") Long id) {
		return productoServices.deleteProducto(id);
	}//deleteOneProduct
	
	@PostMapping
	public Producto addProduct(@RequestBody Producto producto) {
		return productoServices.addProducto(producto);
	}//addProduct
	
	@PutMapping (path = "{prodId}")
	public Producto uptdateProduct(@PathVariable("prodId") Long id, 
			@RequestParam(required = false) String nombre,
			@RequestParam(required = false) String descripcion,
			@RequestParam(required = false) String URL_imagen,
//			@RequestParam(required = false) double precio)
			@RequestParam(required = false) Double precio) {
		return productoServices.updateProducto(id, nombre, descripcion, URL_imagen, precio);
	}//updateProduct
	
}//class
