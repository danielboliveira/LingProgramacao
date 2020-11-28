package Ex5;

public class Complexo {
	private double real;
	private double imaginaria;
	
	public double getReal() {
		return this.real;
	}
	public void setReal(double valor) {
		this.real = valor;
	}
	public double getImaginaria() {
		return imaginaria;
	}
	public void setImaginaria(double imaginaria) {
		this.imaginaria = imaginaria;
	}
	
	public Complexo() {
		this.imaginaria = 0;
		this.real = 0;
	}
	
	public Complexo(double Real,double Imaginaria) {
		this.real = Real;
		this.imaginaria = Imaginaria;
	}
	
	public void Somar(Complexo b) {
		this.real = this.real + b.getReal();
		this.imaginaria = this.imaginaria + b.getImaginaria();
	}
	
	public void Subtrair(Complexo b) {
		this.real = this.real - b.getReal();
		this.imaginaria = this.imaginaria - b.getImaginaria();
	}
	
	public void Print() {
		System.out.printf("%.2f + %.2fi\n",this.real, this.imaginaria);
	}
}
