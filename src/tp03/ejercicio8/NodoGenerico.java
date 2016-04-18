package tp03.ejercicio8;

public class NodoGenerico<T> {
	private T dato;
	private NodoGenerico<T> siguiente;
	
	public NodoGenerico(){
		
	}
	public T getDato(){
		return dato;
	}
	public void setDato (T dato){
		this.dato = dato;
	}
	public NodoGenerico<T> getSiguiente(){
		return siguiente;
	}
	public void setSiguiente (NodoGenerico<T> elemen){
		this.siguiente = elemen;
	}
}
