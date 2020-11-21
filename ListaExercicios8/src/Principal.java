import Ex1.Aluno;
import Ex2.Classe;
public class Principal {

	public static void main(String[] args) {
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

				

	}

}
