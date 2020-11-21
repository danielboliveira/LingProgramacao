import Ex1.Aluno;
import Ex2.Classe;
import Ex3_4.Ponto;
import Ex3_4.VetorDePontos;
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
		
		Ponto p1 = new Ponto(0,0);
		Ponto p2 = new Ponto(10,10);
		Ponto p3 = new Ponto(100,100);
		
		VetorDePontos v = new VetorDePontos(3);
		v.AddPonto(p1);
		v.AddPonto(p2);
		v.AddPonto(p3);
		
		
		v.Remove(1);
		

	}

}
