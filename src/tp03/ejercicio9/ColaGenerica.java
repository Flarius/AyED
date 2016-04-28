package tp03.ejercicio9;

import tp03.ejercicio8.ListaEnlazadaGenerica;
import tp03.ejercicio8.ListaGenerica;

public class ColaGenerica<T> {
	private ListaGenerica<T> datos;
	
	public ColaGenerica() {
		// TODO Auto-generated constructor stub
		datos = new ListaEnlazadaGenerica<T>();
	}
	
	public void encolar(T elemen){
		datos.agregarFinal(elemen);
	}
	public T desencolar (){
		T elemen = datos.elemento(1);
		datos.eliminarEn(1);
		return elemen;
	}
	public boolean esVacia (){
		return datos.esVacia();
	}
	public T tope(){
		return (T)datos.elemento(1);
	}
}
