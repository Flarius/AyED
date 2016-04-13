package tp03.ejercicio5;

import tp03.ejercicio1.ListaDeEnteros;
import tp03.ejercicio1.ListaDeEnterosEnlazada;

public class ColaDeEnteros {
	private ListaDeEnteros datos = new ListaDeEnterosEnlazada ();
	
	public void encolar (int elem){
		datos.agregarFinal(elem);

	}
	
	public Integer desncolar (){
		return 0;
	}
	
	public Integer tope(){
		return datos.elemento(1);
	}
	
	public boolean esVacio (){
		return datos.esVacia();
	}

}
