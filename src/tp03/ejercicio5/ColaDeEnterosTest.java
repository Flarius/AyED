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
	public void desencolarTest (){
		cola.encolar(12);
		assertFalse (cola.tope() == 10);
		assertTrue(cola.tope() == 12);
		cola.encolar(1);
		cola.encolar(2);
		cola.encolar(21);
		cola.encolar(11);
		assertTrue(cola.tope() == 12);
	}

}

