
public class Circulo extends Circunferencia {
	
	public Circulo(Ponto centro, double raio) {
		super(centro, raio);
	}

	public double Area() {
		return Math.PI*this.getRaio()*this.getRaio();
	}
}
