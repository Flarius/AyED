package tp03.ejercicio9;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ColaGenericaTest {
	ColaGenerica<Integer> c;
	
   @Before
   public void setUp () throws Exception{
	   c = new ColaGenerica<Integer>();
	   
   }
   
   
   public void encolar (){
	   c.encolar(54);
	   c.encolar(69);
	   c.encolar(78);
	   c.encolar(96);
	   c.encolar(36);
	   c.encolar(44);   
   }
   
   @Test 
   public void esVaciaTest(){
	   assertTrue(c.esVacia());
	   this.encolar();
	   assertFalse(c.esVacia());
   }
   
   @Test
   public void desencolarTest (){
	   this.encolar();
	   assertTrue(c.desencolar() == 54);
	   assertTrue(c.desencolar() == 69);
	   assertTrue(c.desencolar() == 78);
	   assertTrue(c.desencolar() == 96);
	   assertTrue(c.desencolar() == 36);
	   assertTrue(c.desencolar() == 44);
   }
   
   @Test
   public void tope (){
	   c.desencolar();
       assertTrue(c.tope() == 54);
	   c.desencolar();
	   assertTrue(c.tope() == 69);
	   c.desencolar();
	   assertTrue(c.tope() == 78);
	   c.desencolar();
	   assertTrue(c.tope() == 96);
	   c.desencolar();
	   assertTrue(c.tope() == 36);
	   c.desencolar();
	   assertTrue(c.tope() == 44);
   }
   
}
