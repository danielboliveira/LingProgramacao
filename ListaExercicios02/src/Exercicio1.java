import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número Natural:");
		int n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("Não é um número natural!");
		}
		else {
			if (n % 2 == 0) {
				System.out.println("Par");
			}else {
				System.out.println("Impar");
			}
		}
	}

}
