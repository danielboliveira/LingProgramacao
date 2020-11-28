
public class Linha {
	private Ponto inicio,fim;
	
	public Linha(Ponto Inicio,Ponto Final) {
		this.inicio = Inicio;
		this.fim = Final;
	}

	public Ponto getInicio() {
		return inicio;
	}

	public Ponto getFim() {
		return fim;
	}
	
	public double getComprimento() {
		double dx = inicio.getX() - fim.getX();
		double dy = inicio.getY() - fim.getY();
		
		return Math.sqrt(dx*dx + dy*dy);
	}
	
	public double getInclinacao() {
		double dx = inicio.getX() - fim.getX();
		double dy = inicio.getY() - fim.getY();
		
		return Math.toDegrees(Math.atan(dy/dx));
	}
	
	
}
