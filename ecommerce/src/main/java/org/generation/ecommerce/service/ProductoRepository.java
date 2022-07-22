package org.generation.ecommerce.service;

import java.util.Optional;

import org.generation.ecommerce.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
	
public interface ProductoRepository extends JpaRepository<Producto, Long>{
//	conQuery va a buscar los datos ubicados
	@Query("SELECT p FROM Producto p WHERE p.nombre=?1")
	Optional<Producto> findByNombre(String nombre);
}//interface_ProductoRepository
