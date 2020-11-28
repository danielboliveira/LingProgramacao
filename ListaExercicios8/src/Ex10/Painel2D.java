package Ex10;
import Ex8.Led;
import Ex9.Painel;
public class Painel2D {
	private Painel[] painels;
	
	public Painel2D(int linhas,int quantidadeLeds) {
		painels = new Painel[linhas];
		
		for (int i = 0; i < painels.length; i++) {
			painels[i] = new Painel(quantidadeLeds);
		}
	}
	
	public void Display() {
		for (int i = 0; i < painels.length; i++) {
			System.out.println(painels[i].Display());
		}
	}
	
	private boolean CheckIndex(int index) {
		return (index >= 0 && index <= (painels.length-1));
	}
	
	public void Ligar(int linha,int coluna) {
		if (CheckIndex(linha)) {
			Painel p = painels[linha];
			p.Ligar(coluna);
		}
	}
	
}
