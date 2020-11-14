import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Salário:");
		double salario = sc.nextDouble();
		
		System.out.print("Financiamento:");
		double financiamento = sc.nextDouble();
		
		if (financiamento <= 5*salario) {
			System.out.println("Financiamento concedido");
		}else {
			System.out.println("Financiamento Negado");
		}
		
		System.out.println("Obrigado por nos consultar!");
		
	}

}
