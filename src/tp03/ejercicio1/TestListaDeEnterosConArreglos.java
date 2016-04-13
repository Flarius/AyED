package tp03.ejercicio1;



public class TestListaDeEnterosConArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaDeEnterosConArreglos l = new ListaDeEnterosConArreglos();
		
		for (int i = 0; i < 9; i++) {
			l.agregarInicio(i);
		}
		
		for (int i = 1; i < l.tamanio(); i++) {
			System.out.println(l.elemento(i));
		}		
	}

}
