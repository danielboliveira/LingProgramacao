package Ex4;

public class Contador {
	private int valor;
	
	public void Zerar() {
		this.valor = 0;
	}
	
	public void Incrementar() {
		this.valor++;
	}
	
	public void Incrementar(int incremento) {
		this.valor = this.valor + incremento;
	}
	
	public double getValor() {
		return this.valor;
	}
}
