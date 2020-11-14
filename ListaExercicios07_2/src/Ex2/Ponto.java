package Ex2;

public class Ponto {
	private double x,y;
	
	public void setX(double valor) {
		this.x = valor;
	}
	
	public double getX() {
		return this.x;
	}
	
	public void setY(double valor) {
		this.y = valor;
	}
	public double getY() {
		return this.y;
	}
	
	public double getDistancia(Ponto destino) {
		double dx = this.x - destino.getX();
		double dy = this.y - destino.getY();
		
		return Math.sqrt(dx*dx + dy*dy);
	}
}
