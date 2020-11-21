package Ex1;

public class AlunoVetorNotas{
	private String nome,matricula;
	private double[] notas;
	private int mpos;
	
	public AlunoVetorNotas() {
		this.notas = new double[2];
		this.mpos = 0;
	}
	
	public void AddNota(double nota) {
		if (this.mpos+1 > this.notas.length) {
			System.out.println("Todas as notas foram informadas!");
		}
		else {
			this.notas[this.mpos] = nota;
			this.mpos++;
		}
	}
	
	public double getMedia() {
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma = soma + notas[i];
		}
		
		return soma/notas.length;
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
