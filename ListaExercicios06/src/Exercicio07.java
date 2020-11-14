import java.util.Scanner;
public class Exercicio07 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Informe o total de alunos:");
		int total = sc.nextInt();
		
		String[] nomes  = new String[total];
		double[] notas1 = new double[total];
		double[] notas2 = new double[total];
		
		ObterValores(nomes, notas1, notas2);
		Imprimir(nomes, notas1, notas2);

	}
	
	static void Imprimir(String[] n,double[] n1, double[] n2) {
		for (int i = 0; i < n.length; i++) {
			double m = (n1[i] +n2[i])/2;
			System.out.println(n[i]+"\t" + n1[i] + "\t" + n2[i] + "\t Média=" + m);
		}
	}
	
	static void ObterValores(String[] n,double[] n1, double[] n2) {
		
		for(int i = 0; i< n.length; i++) {
			System.out.print("Nome " + (i+1) +":");
			n[i] = sc.next();
			
			System.out.print("Nota 1 " + (i+1) +":");
			n1[i] = sc.nextDouble();
			
			System.out.print("Nota 2 " + (i+1) +":");
			n2[i] = sc.nextDouble();
		}
				
	}

}
