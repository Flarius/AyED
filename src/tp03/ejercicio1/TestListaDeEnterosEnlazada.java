package tp03.ejercicio1;

public class TestListaDeEnterosEnlazada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDeEnterosEnlazada l = new ListaDeEnterosEnlazada();
		for (int i = 1; i < 10; i++) {
			l.agregarInicio(i);
		}
		for (int i = 1; i < l.tamanio(); i++) {
			System.out.println(l.elemento(i));
		} 
	}

}
