package tp03.ejercicio8;


public class ListaEnlazadaGenerica<T> extends ListaGenerica {
	NodoGenerico<T> inicio;
	NodoGenerico<T> fin;
	NodoGenerico<T> actual;
	int tamanio;
	
	@Override
	public void comenzar() {
		// TODO Auto-generated method stub
		actual = inicio;
	}

	@Override
	//retorna el elemento actual y avanza al proximo de la lista
	public T proximo() {
		// TODO Auto-generated method stub
		T dato = actual.getDato();
		actual = actual.getSiguiente();
		return dato;
	}

	@Override
	//determina si llego al final o no de la lista
	public boolean fin() {
		// TODO Auto-generated method stub
		return (actual == fin);
	}

	@Override
	//retorna el elemento de la posicion indicada
	public T elemento(int pos) {
		// TODO Auto-generated method stub
		if (pos < 1 || pos > this.tamanio()){
			return null; 
		}
		NodoGenerico<T> aux = this.inicio;
		int posAct = 1;
		while (posAct != pos){
			aux=aux.getSiguiente();
			posAct++;
		}
		
		return aux.getDato();
	}

	@Override
	//agrega el elemento en la posicion indicada y retorna true si se pudo agregar 
	public boolean agregarEn( Object elemen, int pos) {
		// TODO Auto-generated method stub
		if (pos < 1 || pos > this.tamanio() + 1){
			return false; 
		}
		this.tamanio++;
		NodoGenerico<T> aux = new NodoGenerico<T>();
		aux.setDato((T) elemen);
		if (pos == 1){
			aux.setSiguiente(inicio);
			inicio = aux;
		}else{
			NodoGenerico<T> n = this.inicio;
			NodoGenerico<T> ant = null;
			int posActual = 1;
			while (pos != posActual) {
				ant = n;
				n = n.getSiguiente();
				posActual++;
			}
			aux.setSiguiente(n);
			ant.setSiguiente(aux);
			if (aux.getSiguiente()==null)
				fin=aux;
		}
		
		return true;
	}

	@Override
	public boolean agregarInicio(Object elemen) {
		// TODO Auto-generated method stub
		return this.agregarEn(elemen, 1);
	}

	@Override
	public boolean agregarFinal(Object elemen) {
		// TODO Auto-generated method stub
		return this.agregarEn(elemen, this.tamanio());
	}

	@Override
	public boolean eliminar(Object elemen) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarEn(int pos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esVacio() {
		// TODO Auto-generated method stub
		return this.inicio == this.fin;
	}

	@Override
	public boolean incluye(Object elemen) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int tamanio() {
		// TODO Auto-generated method stub
		return this.tamanio;
	}

	@Override
	public boolean reemplazar(Object elemen, int pos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean agregarTodos(ListaGenerica l) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ListaGenerica clonar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void limpiar() {
		// TODO Auto-generated method stub

	}
	
	public String toString (){
		return "";
	}

}
