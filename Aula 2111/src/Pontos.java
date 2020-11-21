import java.util.ArrayList;
public class Pontos {
	private ArrayList<Ponto> pontos;
	
	public Pontos() {
		this.pontos = new ArrayList<Ponto>();
	}
	
	public void AddPonto(Ponto ponto) {
		pontos.add(ponto);
	}
	
	public int getQuantidade() {
		return this.pontos.size();
	}
	
	public int getPos(Ponto ponto) {
		return this.pontos.indexOf(ponto);
	}
	
	public void ListPontos() {
		for(Ponto p:pontos) {
			System.out.printf("(%.2f , %.2f)\n",p.getX(),p.getY());
		}
	}
}
