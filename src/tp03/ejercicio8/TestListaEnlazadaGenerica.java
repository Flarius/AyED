package tp03.ejercicio8;

public class TestListaEnlazadaGenerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer> ();
		lista.agregarEn(12, 1);
		lista.agregarEn(2, 2);
		lista.agregarEn(2658, 2);

		
		for (int i = 1; i <= lista.tamanio(); i++) {
			System.out.println("en la pos: " + i + "esta el elemento: "+ lista.elemento(i));
		}

	}

}
