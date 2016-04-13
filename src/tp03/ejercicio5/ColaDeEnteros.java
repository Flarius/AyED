package tp03.ejercicio5;

import tp03.ejercicio1.ListaDeEnteros;
import tp03.ejercicio1.ListaDeEnterosEnlazada;

public class ColaDeEnteros {
	private ListaDeEnteros datos = new ListaDeEnterosEnlazada ();
	
	//agrega un elemento a la cola
	public void encolar (int elem){
		datos.agregarFinal(elem);

	}
	//saca un elemento de la cola y lo retorna
	public Integer desencolar (){
		 Integer dato = datos.elemento(1);
		 datos.eliminarEn(1);
		return dato;
	}
	
	//retornar el primer elemento de la cola sin sacarlo de la misma
	public Integer tope(){
		return datos.elemento(1);
	}
	
	//retorna true en caso de que la cola este vacia
	public boolean esVacio (){
		return datos.esVacia();
	}

}
