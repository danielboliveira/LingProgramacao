import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N�mero Natural:");
		int n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("N�o � um n�mero natural!");
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
