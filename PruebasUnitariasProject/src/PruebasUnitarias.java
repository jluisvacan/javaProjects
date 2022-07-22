import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasUnitarias {
	Operaciones op = new Operaciones();
	
	
	@Test
	public void testString() {
		assertNotNull(op.getPI());
	}
	
	@Test
	void testBoolean() {
		assertTrue(op.getPI()>=3.14);
	}//testBoolean
	

	@Test
	@DisplayName("Probar todas las sumas en conjunto")
	void probarSumas() {
		assertAll("Sumas",
				()-> assertEquals(4, op.sum(2, 2)),
				()-> assertEquals(7, op.sum(2, 5)),
				()-> assertEquals(15, op.sum(10, 5)),
				()-> assertEquals(20, op.sum(10, 10))
				);
	}//porbarSumas
	@Test
	void probarMultiplicaciones() {
		assertEquals(4, op.multiplicar(2, 2));
		assertEquals(10, op.multiplicar(2, 5));
		assertEquals(15, op.multiplicar(3, 5));
		assertEquals(20, op.multiplicar(2, 10));
	}//porbarMultiplicaciones
	
	
	
}//classPruebasUnitarias
