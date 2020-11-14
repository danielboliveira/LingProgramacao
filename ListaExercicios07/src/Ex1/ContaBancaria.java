package Ex1;

public class ContaBancaria {
	private double saldo;
	
	public void Depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public void Sacar(double valor) {
		saldo = saldo - valor;
	}
	
	public double VerificarSaldo() {
		return saldo;
	}
	
}
