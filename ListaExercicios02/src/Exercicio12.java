import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Lados a,b e c:");
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		
		if (!(a < b+c && b < a+c && c < a+b)) {
			System.out.println("N�o formam um tri�ngulo");
			System.exit(0);
		}
		
		if (a==b && b == c) {
			System.out.println("Equil�tero");
		}else {
			if (a == b || a == c || b == c) {
				System.out.println("Is�sceles");
			}else {
				System.out.println("Escaleno");
			}
		}
		
		s.close();

	}

}
