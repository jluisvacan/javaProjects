package org.generation.ecommerce;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.generation.ecommerce.model.Producto;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
//import org.springframework.core.annotation.Order;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
class EcommerceApplicationTests {
	
	@Autowired
	private MockMvc mockMvc; 
	
	@Test
	public void pruebaPOST() throws Exception{
		Producto p = new Producto();
		p.setPrecio(45);
		p.setNombre("Cuaderno profesional raya");
		p.setURL_imagen("CuadernoRayaNorma.jpg");
		p.setDescripcion("Cuaderno profesional raya portada roja Norma");
		this.mockMvc.perform( post("/api/products/") 
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(p))
				)
		   .andDo( print() )
		   .andExpect( status().isOk() )
		   .andExpect( content().string(containsString("Cuaderno profesional raya") ) );
	}//pruebaPOST
	
	
	public static String asJsonString(final Object obj) {
	    try {
		      return new ObjectMapper().writeValueAsString(obj);
		    } catch (Exception e) {
		      throw new RuntimeException(e);
		    }//catch
	} // asJsonString

	
	@Test
	@Disabled ("Deshabilitado temporalmente")
	public void pruebaDELETE() throws Exception{
		   this.mockMvc.perform( delete("/api/products/6") )
		   .andDo( print() )
		   .andExpect( status().isOk() )
		   .andExpect( content().string(containsString("Cuaderno profesional raya") ) );
	}//pruebaDELETE
	
	
	@Test
	public void pruebaPUT() throws Exception{
		this.mockMvc.perform( put("/api/products/1").
				queryParam("nombre", "super nombre nuevo")
//				.header("Authorization", "Bearer: XXXXXXXXXXX"))
				)
		.andDo( print() )
		.andExpect( status().isOk() )
		.andExpect( content().string(containsString("super nombre") ) );
	}//pruebaPUT
	
	@Test
	@Disabled ("Se validara posteriormente")
	public void prueba404() throws Exception{
		this.mockMvc.perform(get("/api/products/1"))
		.andDo( print() )
		.andExpect( status().isNotFound());
	}//prueba404
	
	
	
	@Test
	void pruebaGET() throws Exception {
	   this.mockMvc.perform( get("/api/products/1") )
	   .andDo( print() )
	   .andExpect( status().isOk() )
	   .andExpect( content().string(containsString("nuevo") ) );
	   
	   this.mockMvc.perform( get("/api/products/4") )
	   .andDo( print() )
	   .andExpect( status().isOk() )
	   .andExpect( content().string(containsString("Cuaderno italiana doble raya") ) );
	   
	   this.mockMvc.perform( get("/api/products/3") )
	   .andDo( print() )
	   .andExpect( status().isOk() )
	   .andExpect( content().string(containsString("Cuaderno profesional cuadro chico") ) );
	}//pruebaGET

}
