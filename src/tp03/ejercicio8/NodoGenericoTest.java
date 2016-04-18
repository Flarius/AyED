package tp03.ejercicio8;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NodoGenericoTest {
	 NodoGenerico<Integer> nodo;
	@Before
	public void setUp () throws Exception{
		nodo = new NodoGenerico<Integer> ();
		
	}
	
	@Test
	public void crearNodo (){
		nodo.setDato(15);
		assertTrue(nodo.getDato() == 15);
		assertFalse(nodo.getDato() == 25);
	}
    
	@Test
	public void enlazarNodo (){
		 NodoGenerico<Integer> nodo1 = new NodoGenerico<Integer>();
		 nodo.setDato(15);
		 nodo1.setDato(25);
		 nodo.setSiguiente(nodo1);
		 assertTrue (nodo.getSiguiente().getDato() == 25);
	}
	
	
}
