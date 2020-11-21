package Ex2;
import Ex1.Aluno;
import java.util.ArrayList;

public class Classe {
	private ArrayList<Aluno> alunos;
	
	public Classe() {
		this.alunos = new ArrayList<Aluno>();
	}
	
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void PrintInfo() {
		for(Aluno a:alunos) {
			a.PrintInfo();
		}
	}
	
	
}
