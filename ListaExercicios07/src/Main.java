import Ex1.ContaBancaria;
import Ex2.Ponto;
import Ex3.Circulo;
import Ex4.Contador;

public class Main {

	public static void main(String[] args) {
		/*ContaBancaria cc = new ContaBancaria();
		
		System.out.println(cc.VerificarSaldo());
		cc.Depositar(100);
		System.out.println(cc.VerificarSaldo());
		cc.Sacar(50.5);
		System.out.println(cc.VerificarSaldo());*/
		
		/*
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();
		
		p1.setX(0);
		p1.setY(0);
		
		p2.setX(10);
		p2.setY(10);
		
		System.out.println(p1.CalcularDistancia(p2));
		*/
		/*
		Circulo c = new Circulo();
		Ponto p1 = new Ponto();
		p1.setX(0);
		p1.setY(0);
		c.setCentro(p1);
		c.setRaio(10);
		System.out.println(c.getArea());
		System.out.println(c.getComprimento());*/
		
		Contador c = new Contador();
		System.out.println(c.getContador());
		c.Incrementar();
		c.Incrementar();
		System.out.println(c.getContador());
		c.Zerar();
		System.out.println(c.getContador());
		
		
	}

}
