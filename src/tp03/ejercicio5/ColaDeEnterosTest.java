package tp03.ejercicio5;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ColaDeEnterosTest {
	ColaDeEnteros cola;
	
	@Before
	public void setUp() {
		cola = new ColaDeEnteros();
	}
	
	
	@Test
	public void topeTest (){
		cola.encolar(12);
		assertFalse (cola.tope() == 10);
		assertTrue(cola.tope() == 12);
		cola.encolar(1);
		cola.encolar(2);
		cola.encolar(21);
		cola.encolar(11);
		assertTrue(cola.tope() == 12);
		
		
	}
	
	@Test
	public void esVaciaTest (){
		assertTrue (cola.esVacio());
		cola.encolar(55);
		cola.encolar(13);
		assertFalse(cola.esVacio());
	}
	
	@Test 
	public void desencolarTest (){
		cola.encolar(40);
		cola.encolar(30);
		cola.encolar(60);
		cola.encolar(1);
		cola.encolar(8);
		assertTrue (cola.desencolar() == 40);
		assertTrue (cola.desencolar() == 30);
		assertFalse (cola.desencolar()== 1);
		assertTrue (cola.desencolar() == 1);
		assertTrue (cola.desencolar() == 8);
	}

}

