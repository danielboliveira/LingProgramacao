package Ex1;

public class Conta {
	private double saldo;
	
	public void Depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void Sacar(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	public double VerificarSaldo() {
		return this.saldo;
	}
}
