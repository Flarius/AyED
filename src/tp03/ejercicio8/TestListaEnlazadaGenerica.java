package tp03.ejercicio8;

public class TestListaEnlazadaGenerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer> ();
		lista.agregarEn(12, 1);
		lista.agregarEn(2, 2);
		lista.agregarEn(2658, 3);
		lista.agregarEn(112, 4);
		lista.agregarEn(36, 5);
		lista.agregarEn(892, 6);
		lista.agregarEn(147, 7);
		
		lista.comenzar();
		for (int i = 1; i <= lista.tamanio(); i++) {
			System.out.println(lista.elemento(i));
		}
		System.out.println("   ");
		lista.agregarEn(999, 3);
		for (int i = 1; i <= lista.tamanio(); i++) {
			System.out.println(lista.elemento(i));
		}		
//		NodoGenerico<Integer> nodo = new NodoGenerico<>();
//		nodo.setDato(45);
//		System.out.println(nodo.getSiguiente());
//	}

}
}