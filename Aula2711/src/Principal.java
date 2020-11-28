
public class Principal {

	public static void main(String[] args) {
		Ponto p1 = new Ponto();
		p1.setX(0);
		p1.setY(0);
		
		Ponto p2 = new Ponto();
		p2.setX(10);
		p2.setY(10);
		
		Linha l = new Linha(p1,p2);
		System.out.println(l.getInicio().toString());
		System.out.println(l.getFim().toString());
		System.out.println(l.getComprimento());
		System.out.println(l.getInclinacao());
				
	}
	
	

}
