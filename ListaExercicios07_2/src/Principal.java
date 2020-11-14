import Ex1.Conta;
import Ex2.Ponto;
import Ex3.Circulo;
import Ex4.Contador;

public class Principal {

	public static void main(String[] args) {
		/*
		Conta c = new Conta();
		System.out.println(c.VerificarSaldo());
		c.Depositar(100);
		System.out.println(c.VerificarSaldo());
		c.Sacar(25);
		System.out.println(c.VerificarSaldo());
		*/
		/*
		Ponto p1 = new Ponto();
		p1.setX(0);
		p1.setY(0);
		
		Ponto p2 = new Ponto();
		p2.setX(10);
		p2.setY(10);
		
		System.out.println(p1.getDistancia(p2));
		*/
		/*
		Circulo c = new Circulo();
		c.setRaio(1);
		System.out.println(c.getArea());
		System.out.println(c.getComprimento());
			*/
		
		Contador c = new Contador();
		System.out.println(c.getValor());
		c.Incrementar();
		System.out.println(c.getValor());
		c.Incrementar(2);
		System.out.println(c.getValor());
		c.Zerar();
		System.out.println(c.getValor());

	}

}
