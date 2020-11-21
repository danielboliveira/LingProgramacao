package Ex1;

import java.util.ArrayList;

public class Aluno {
	private String nome,matricula;
	private ArrayList<Double> notas;
	
	public Aluno() {
		this.notas = new ArrayList<Double>();
	}
	
	public void AddNota(double nota) {
		if (!(nota >= 0 && nota <= 10)) {
			System.out.println("Nota inválida!");
		}
		else{
			this.notas.add(nota);
		}
	}
	
	public double getMedia() {
		double soma = 0;
		double media = 0;
		
		for (Double nota : notas) {
			soma = soma + nota;
		}
		
		if (notas.size() > 0)
			media = soma / notas.size();
		else 
			media = -1;
		
		return media;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String valor) {
		this.nome = valor;
	}
	public String getMatricula() {
		return this.matricula;
	}
	public void setMatricula(String valor) {
		this.matricula = valor;
	}
	
	public void PrintInfo() {
		System.out.printf("%s - %s - %.2f\n",this.matricula,this.nome,this.getMedia());
	}
	
}
