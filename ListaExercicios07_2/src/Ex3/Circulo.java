package Ex3;

public class Circulo {
	private double raio;
	
	public void setRaio(double valor) {
		this.raio = valor;
	}
	
	public double getArea() {
		return Math.PI*this.raio*this.raio;
	}
	
	public double getComprimento() {
		return 2*Math.PI*this.raio;
	}

}


