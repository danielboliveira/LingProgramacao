
public class Exercicio06 {

	public static void main(String[] args) {
		
		System.out.println(CalcularDistancia(0, 0, 10,10));

	}
	
	static double CalcularDistancia(double x1,double y1,double x2,double y2) {
		double dx = x2-x1;
		double dy = y2-y1;
		double d = Math.sqrt(dx*dx + dy*dy);
		return d;
	}

}
