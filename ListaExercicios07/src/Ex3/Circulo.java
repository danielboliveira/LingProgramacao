package Ex3;
import Ex2.Ponto;

public class Circulo {
	private double raio;
	private Ponto centro;
	
	public void setCentro(Ponto ponto) {
		this.centro = ponto;
	}
	
	public void setRaio(double valor) {
		this.raio = valor;
	}
	public double getRaio() {
		return this.raio;
	}
	
	public double getArea() {
		return Math.PI*this.raio*this.raio;
	}
	
	public double getComprimento() {
		return 2*Math.PI*this.raio;
	}
}
