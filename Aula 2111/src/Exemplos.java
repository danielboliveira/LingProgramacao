
public class Exemplos {

	public static void main(String[] args) {
		Pontos ps = new Pontos();
		
		ps.AddPonto(new Ponto(1,1));
		ps.AddPonto(new Ponto(10,20));
		ps.AddPonto(new Ponto(30,40));
		ps.AddPonto(new Ponto());
		
		Ponto p1 = new Ponto(300,300);
		ps.AddPonto(p1);
				
		ps.ListPontos();
		
		System.out.println(ps.getPos(new Ponto(300,300)));
		
	}

}
