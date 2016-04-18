package tp03.ejercicio8;

public abstract class ListaGenerica<T> {
	private int tamanio;
	
	public ListaGenerica(){
		
	}
	public abstract void comenzar();
	public abstract T proximo();
	public abstract boolean fin();
	public abstract T elemento(int n);
	public abstract boolean agregarEn(T elemen, int pos);
	public abstract boolean agregarInicio(T elemen);
	public abstract boolean agregarFinal(T elemen);
	public abstract boolean eliminar(T elemen);
	public abstract boolean eliminarEn(int pos);
	public abstract boolean esVacio();
	public abstract boolean incluye(T elemen);
	public abstract int tamanio();
	public abstract boolean reemplazar(T elemen, int pos);
	public abstract boolean agregarTodos(ListaGenerica<T> l);
	public abstract ListaGenerica<T> clonar();
	public abstract void limpiar();
		
}
