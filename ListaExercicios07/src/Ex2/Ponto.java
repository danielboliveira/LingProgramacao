package Ex2;

public class Ponto {
	private double x,y;
	
	public void setX(double valor) {
		x = valor;
	}
	public double getX() {
		return x;
	}
	
	public void setY(double valor) {
		this.y = valor;
	}
	public double getY() {
		return this.y;
	}
	
	public double CalcularDistancia(Ponto p) {
		double dx = this.x - p.getX();
		double dy = this.y - p.getY();
		return Math.sqrt(dx*dx + dy*dy);
	}

}
