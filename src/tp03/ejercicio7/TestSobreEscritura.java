package tp03.ejercicio7;

public class TestSobreEscritura {
	
	public static void main (String [] args){
		SmartPhone tel1 = new SmartPhone ();
		tel1.setMarca("sansung");
		tel1.setModelo("galaxi");
		tel1.setCosto(1500);
		tel1.setSistemaOperativo("android");
		tel1.setNumero(155488117);
		
		SmartPhone tel2 = new SmartPhone ();
		tel2.setMarca("sansung");
		tel2.setModelo("galaxi");
		tel2.setCosto(1500);
		tel2.setSistemaOperativo("android");
		tel2.setNumero(155488117);
		
		System.out.println(tel1.equals(tel2));
	}
    
}
