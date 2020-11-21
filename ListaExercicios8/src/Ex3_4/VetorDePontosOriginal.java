package Ex3_4;

public class VetorDePontosOriginal {
	private Ponto[] pontos;
	private int maxPontos;
	private int mpos;
	
	public VetorDePontosOriginal(int QuantidadeMax) {
		pontos = new Ponto[QuantidadeMax];
		maxPontos = QuantidadeMax;
		mpos = 0;
	}
	
	public void AddPonto(Ponto ponto) {
		if (mpos + 1 > maxPontos) {
			System.out.println("Vetor cheio!");
		}else {
			
			if (this.getIndex(ponto) == -1) {
				pontos[mpos] = ponto;
				mpos++;
			}
		}
	}
	
	public int getTamanho() {
		return this.mpos;
	}
	
	private boolean CheckIndexOutVetor(int index) {
		return index > pontos.length-1;
	}
	public Ponto getPonto(int index) {
		if (CheckIndexOutVetor(index)) {
			System.out.println("Posição não válida!");
			return null;
		}
		return pontos[index];
	}
	
	public int getIndex(Ponto p) {
		int index = -1;
		for (int i=0;i< pontos.length;i++) {
			if (pontos[i] == null)
				continue;
			
			if (pontos[i].Compare(p))
			{
				index = i;
				break;
			}
		}
		
		return index;
				
	}
	
	public void Remove(int index) {
		if (CheckIndexOutVetor(index)) {
			System.out.println("Posição não válida!");
			return;
		}
		
		pontos[index] = null;
		
		if (index == pontos.length-1)
			return;
		
		Ponto aux = null;
		for(int i=index+1;i<pontos.length;i++) {
			aux = pontos[i-1];
			pontos[i-1] = pontos[i];
			pontos[i] = aux;
		}
		
		
	}
}
