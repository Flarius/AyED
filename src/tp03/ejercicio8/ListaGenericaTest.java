package tp03.ejercicio8;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ListaGenericaTest {
	
	ListaEnlazadaGenerica<Integer> lista;
	
	@Before 
	public void setUp() throws Exception{
		lista = new ListaEnlazadaGenerica<Integer> ();
		
	}
	
//	//retorna una lista cargada
	public ListaEnlazadaGenerica<Integer> cargarlista(){
		lista.agregarEn(12, 1);
		lista.agregarEn(2, 2);
		lista.agregarEn(2658, 3);
		lista.agregarEn(112, 4);
		lista.agregarEn(36, 5);
		lista.agregarEn(892, 6);
		lista.agregarEn(147, 7);
		return lista;
	}

	@Test 
	public void agregarElementosEnTest (){
		//se agregan al principio
		assertTrue(lista.agregarEn(12, 1));		
		assertTrue(lista.agregarEn(2, 1));
		assertTrue(lista.agregarEn(2658, 1));
		assertTrue(lista.agregarEn(112, 1));
		
		//se agregan consecutivamente
		assertTrue(lista.agregarEn(36, 5));
		assertTrue(lista.agregarEn(892, 6));
		assertTrue(lista.agregarEn(147, 7));
		
		//se agregan al final
		assertTrue(lista.agregarEn(147, lista.tamanio()));
		assertTrue(lista.agregarEn(148, lista.tamanio()));
		assertTrue(lista.agregarEn(149, lista.tamanio()));
		
		//se agregan en el medio
		assertTrue(lista.agregarEn(121, 4));
		assertTrue(lista.agregarEn(543, 5));
		assertTrue(lista.agregarEn(878, 3));
	
	}
	
	@Test 
	public  void elementoTest (){
		lista = this.cargarlista();
		lista.comenzar();
		assertTrue(lista.elemento(1) == 12);
		assertTrue(lista.elemento(2) == 2);
		assertTrue(lista.elemento(3) == 2658);
		assertFalse(lista.elemento(4) == 12);
		assertTrue(lista.elemento(5) == 36);
	}
	
	@Test 
	public void proximoTest(){
		lista = this.cargarlista();
		lista.comenzar();
		assertTrue(lista.proximo() == 12);
		assertTrue(lista.proximo() == 2);
		assertTrue(lista.proximo() == 2658);
		assertFalse(lista.proximo() == 12);
		assertTrue(lista.proximo() == 36);
		assertTrue(lista.proximo() == 892);
	}

	@Test
	public void esVacioTest(){
		assertTrue(lista.esVacio());
		lista.comenzar();
		this.agregarElementosEnTest();
		lista.comenzar();
		assertFalse (lista.esVacio());
	}

//	@Test
//	public void elminarEnTest (){
//		
//	}
//	
//	@Test
//	public void eleminarElementoTest (){
//		
//	}
}