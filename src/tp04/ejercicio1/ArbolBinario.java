package tp04.ejercicio1;

import tp03.ejercicio8.ListaEnlazadaGenerica;
import tp03.ejercicio8.ListaGenerica;

public class ArbolBinario<T> {

	private NodoBinario<T> raiz;
	int cantidad;

	public ArbolBinario(T dato) {
		this.raiz = new NodoBinario<T>(dato);
	}

	private ArbolBinario(NodoBinario<T> nodo) {
		this.raiz = nodo;
	}

	private NodoBinario<T> getRaiz() {
		return raiz;
	}

	public T getDatoRaiz() {
		if (this.getRaiz() != null) {
			return this.getRaiz().getDato();
		} else {
			return null;
		}
	}

	public ArbolBinario<T> getHijoIzquierdo() {
		return new ArbolBinario<T>(this.raiz.getHijoIzquierdo());
	}

	public ArbolBinario<T> getHijoDerecho() {
		return new ArbolBinario<T>(this.raiz.getHijoDerecho());
	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.raiz.setHijoIzquierdo(hijo.getRaiz());
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.raiz.setHijoDerecho(hijo.getRaiz());
	}

	public void eliminarHijoIzquierdo() {
		this.raiz.setHijoIzquierdo(null);
	}

	public void eliminarHijoDerecho() {
		this.raiz.setHijoDerecho(null);
	}

	public boolean esVacio() {
		return this.getDatoRaiz() == null;
	}

	public boolean esHoja() {
		return this.getDatoRaiz() != null && this.getHijoIzquierdo().esVacio() && this.getHijoDerecho().esVacio();
	}
	
	private void frontera (ListaGenerica<T> l, ArbolBinario<T> a){
		if (a.esHoja()){
			l.agregarFinal(a.getDatoRaiz());
		}
		
		if (!a.getHijoIzquierdo().esVacio()){
			a.getHijoIzquierdo().frontera(l,a.getHijoIzquierdo());
		}
		
		if (!a.getHijoDerecho().esVacio()){
			a.getHijoDerecho().frontera(l,a.getHijoDerecho());
		}
		
	}
	
	public ListaGenerica<T> frontera() {

		ListaGenerica<T> l = new ListaEnlazadaGenerica<T> ();
		this.frontera (l, this);
		return l;
	}

	public boolean completo() {
		// Falta implementar. Ejercicio 2.b de la práctica
		
		return true;
	}

	public boolean lleno() {
		return (int) Math.pow(2, (this.altura(raiz) + 1)) -1 == this.cantidad();
	}
	
	public int cantidad (){
		cantidad = 0;
		cantidad (raiz);
		return cantidad;
	}
	
	private void cantidad (NodoBinario<T> a){
		if (a != null){
			cantidad++;
			cantidad(a.getHijoIzquierdo());
			cantidad(a.getHijoDerecho());
		}
	}
		
	private int altura (NodoBinario<T> nodo){
		int altDer;
		int altIzq;
		if (nodo == null)
			return -1;
		else{
			altDer = 1 + altura(nodo.getHijoDerecho());
			altIzq = 1 + altura(nodo.getHijoIzquierdo());
			return Math.max(altDer, altIzq);
		}
	}

}