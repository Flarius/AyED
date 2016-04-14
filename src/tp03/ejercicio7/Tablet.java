package tp03.ejercicio7;

public class Tablet extends Mobile {
	private int pulgadas;

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}
	
	public boolean equals(Object o) {
		return false;
	}
	
	public String toString() {
		return this.getMarca() +" "+ this.getSistemaOperativo() +" "+
				this.getModelo() +" "+ this.getCosto() +" "+
				this.getPulgadas();  
	}
}
