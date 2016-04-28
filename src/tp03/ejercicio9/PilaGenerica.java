package tp03.ejercicio9;
import tp03.ejercicio8.ListaEnlazadaGenerica;
import tp03.ejercicio8.ListaGenerica;

public class PilaGenerica<T> {
	private ListaGenerica<T> datos;
	
	public PilaGenerica() {
		// TODO Auto-generated constructor stub
		datos = new ListaEnlazadaGenerica<T>();
	}
	public void apilar (T elemen){
		datos.agregarFinal(elemen);
	}
	public T desapilar(){
		T elemen = datos.elemento(1);
		datos.eliminarEn(1);
		return elemen;
	}
	public T tope(){
		return (T)datos.elemento(1);
	}
	public boolean esVacia (){
		return datos.esVacia();
	}
}

