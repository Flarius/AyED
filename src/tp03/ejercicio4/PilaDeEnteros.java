package tp03.ejercicio4;
import tp03.ejercicio1.ListaDeEnteros;

public class PilaDeEnteros {
	private ListaDeEnteros datos;
	
	PilaDeEnteros (){
		
	}
	
	public void apilar (int elem){
		datos.agregarInicio(elem);
	}
	public int desapilar (){
		Integer dato = datos.elemento(1);
		datos.eliminar(dato);
		return dato;
	}
	public int tope (){
		return datos.elemento(1);
	}
	public boolean esVacia (){
		return datos.esVacia();
	}
}
