import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome:");
		String nome = sc.next();
		
		System.out.print("Dist�ncia Total:");
		double dist = sc.nextDouble();
		
		System.out.print("Tempo:");
		double tempo = sc.nextDouble();
		
		double vm = dist / tempo;
		
		System.out.println("A velocidade m�dia " + nome + " � de " + vm + " km/h");
		
		sc.close();

	}

}
