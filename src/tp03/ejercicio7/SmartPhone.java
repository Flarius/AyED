package tp03.ejercicio7;

public class SmartPhone extends Mobile {
	private int numero;
	
	public SmartPhone (){
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean equals(SmartPhone o) {
		if (this.getMarca() == o.getMarca()) {
			System.out.println(this.getMarca() == o.getMarca());
			if (this.getModelo() == o.getModelo()){
				if (this.getSistemaOperativo() == o.getSistemaOperativo()){
					if (this.getNumero() == o.getNumero()){
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public String toString() {
		return this.getMarca() +" "+ this.getSistemaOperativo() +" "+
				this.getModelo() +" "+ this.getCosto() +" "+
				this.getNumero();  
	}
}
