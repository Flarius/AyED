package tp03.ejercicio8;


public class ListaEnlazadaGenerica<T> extends ListaGenerica {
	NodoGenerico<T> inicio = null;
	NodoGenerico<T> fin = null;
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

	 
	private boolean insertar( Object elemen, int pos) {
		//se agrega el inicio de la lista
		if (pos == 1){
			this.tamanio = this.tamanio + 1;
			NodoGenerico<T> aux = new NodoGenerico<T> ();
			aux.setDato( (T)elemen);
			aux.setSiguiente(inicio);
			inicio = aux;
		}
		//se agrega en el final de la lista
		else if (pos == this.tamanio()+1) {
			this.tamanio = this.tamanio + 1;
			NodoGenerico<T> aux = new NodoGenerico<T> ();
			aux.setDato( (T)elemen);
            actual.setSiguiente(aux);
            aux.setSiguiente(fin);
		}
		//se agrega en el medio de la lista
		else {
			this.tamanio = this.tamanio + 1;
			NodoGenerico<T> aux = new NodoGenerico<T>();
		    aux.setDato( (T)elemen);
		    aux.setSiguiente(actual.getSiguiente());
		    actual.setSiguiente(aux);
		}   
		return true;
		
	}
	
	@Override
	//agrega el elemento en la posicion indicada y retorna true si se pudo agregar
	public boolean agregarEn(Object elemen, int pos) {
		if (pos < 1 || pos > this.tamanio() + 1){
			return false; 
		}
		this.comenzar();
		
		//en caso de tener que agregar en el medio
		if (pos != 1 && pos != this.tamanio()+1){
		  int posAux = pos -1;
		  this.mover(posAux);
		  return this.insertar(elemen, pos);
		}
		//en caso deagregar al inicio o al final
		int posAux = pos;
		this.mover(posAux);
		return this.insertar(elemen, pos);
	}
	
	//metodo que nos permite movernos en la lista
	private NodoGenerico <T> mover (int posAux){
		if (posAux == 1){
			return actual;
		}else{
			if (actual.getSiguiente() != fin){
				posAux = posAux -1;
				actual = actual.getSiguiente();
				this.mover(posAux);
		    }
		}
		return actual;    
	}

	@Override
	public boolean agregarInicio(Object elemen) {
		// TODO Auto-generated method stub
		return this.agregarEn(elemen, 1);
	}

	@Override
	public boolean agregarFinal(Object elemen) {
		// TODO Auto-generated method stub
		return this.agregarEn(elemen, this.tamanio()+1);
	}

	@Override
	public boolean eliminar(Object elemen) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarEn(int pos) {
		// TODO Auto-generated method stub
		if (pos < 1 || pos > this.tamanio())
			return false;
		this.comenzar();
		if (pos != 1 && pos != this.tamanio() + 1){
			int posAux = pos -1;
//			return this.mover
		}
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
