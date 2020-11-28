
public class Circunferencia {
	private Ponto centro;
	protected double raio;
	
	public Circunferencia(Ponto centro, double raio) {
		this.centro = centro;
		this.raio = raio;
	}
	
	public double getComprimento() {
		return 2*Math.PI*this.getRaio();
	}

	public Ponto getCentro() {
		return centro;
	}

	protected double getRaio() {
		return raio;
	}
}
