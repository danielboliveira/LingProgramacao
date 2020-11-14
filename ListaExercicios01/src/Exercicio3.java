import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome:");
		String nome = sc.next();
		
		System.out.print("Distância Total:");
		double dist = sc.nextDouble();
		
		System.out.print("Tempo:");
		double tempo = sc.nextDouble();
		
		double vm = dist / tempo;
		
		System.out.println("A velocidade média " + nome + " é de " + vm + " km/h");
		
		sc.close();

	}

}
