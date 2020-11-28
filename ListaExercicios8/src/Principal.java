import Ex1.Aluno;
import Ex2.Classe;
import Ex3_4.Ponto;
import Ex3_4.VetorDePontos;
import Ex5.Complexo;
import Ex6.Date;
import Ex8.Led;
import Ex9.Painel;
import Ex10.Painel2D;

public class Principal {

	public static void main(String[] args) {
		/*
		Classe c = new Classe();
		
		Aluno a = new Aluno();
		a.setMatricula("010001");
		a.setNome("Daniel Oliveira");
		a.AddNota(10);
		a.AddNota(10);
		a.AddNota(7.5);
		c.addAluno(a);
		
		Aluno a2 = new Aluno();
		a2.setMatricula("010002");
		a2.setNome("Pedro Oliveira");
		a2.AddNota(5);
		a2.AddNota(6);
		a2.AddNota(7.5);
		c.addAluno(a2);
		
		c.PrintInfo();
*/
/*		
		Ponto p1 = new Ponto(0,0);
		Ponto p2 = new Ponto(10,10);
		Ponto p3 = new Ponto(100,100);
		
		VetorDePontos v = new VetorDePontos(3);
		v.AddPonto(p1);
		v.AddPonto(p2);
		v.AddPonto(p3);
		
		
		v.Remove(1);
	*/
	/*	
		Complexo c1 = new Complexo(5,4);
		c1.Print();
		Complexo c2 = new Complexo(3,2);
		c2.Print();
		
		c1.Somar(c2);
		c1.Print();
		*/
	/*	
		Date d1 = new Date(29,2,2020);
		d1.Display();
		d1.NextDay().Display();
		*/
		
		/*Painel p = new Painel(6);
		p.Ligar(2);
		p.Ligar(3);
		p.Lista();
		System.out.println(p.Display());-*/
		
		Painel2D p2  = new Painel2D(6,6);
		p2.Ligar(0, 2);p2.Ligar(0, 3);
		p2.Ligar(1, 0);p2.Ligar(1, 5);
		p2.Ligar(2, 0);p2.Ligar(2, 5);
		p2.Ligar(3, 0);p2.Ligar(3, 5);
		p2.Ligar(4, 0);p2.Ligar(4, 5);
		p2.Ligar(5, 2);p2.Ligar(5, 3);
		p2.Display();
		
		
	}

}
