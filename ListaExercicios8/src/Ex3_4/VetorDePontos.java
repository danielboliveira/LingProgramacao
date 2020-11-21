package Ex3_4;
import java.util.ArrayList;

public class VetorDePontos {
	private ArrayList<Ponto> pontos;
	
	public VetorDePontos(int QuantidadeMax) {
		pontos = new ArrayList<Ponto>();
	}
	
	public void AddPonto(Ponto ponto) {
		pontos.add(ponto);
	}
	
	public int getTamanho() {
		return this.pontos.size();
	}
	
	public Ponto getPonto(int index) {
		return pontos.get(index);
	}
	
	public int getIndex(Ponto p) {
		return pontos.indexOf(p);
				
	}
	
	public void Remove(int index) {
		pontos.remove(index);
	}
}
