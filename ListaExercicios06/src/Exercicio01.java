import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nota 1:");
		double a = sc.nextDouble();
		System.out.println("Nota 2:");
		double b = sc.nextDouble();
		
		System.out.println("Média = " + CalcularMedia(a, b));

	}
	
	static double CalcularMedia(double n1,double n2) {
		return (n1+n2)/2;
	}

}
