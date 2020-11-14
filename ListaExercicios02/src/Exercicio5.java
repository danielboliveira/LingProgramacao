import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome:");
		String nome = sc.next();
		
		System.out.print("N1:");
		double n1 = sc.nextDouble();
		if (!(n1 >= 0 && n1 <= 10)) {
			System.out.println("Nota inválida");
			System.exit(0);
		}
		
		System.out.print("N2:");
		double n2 = sc.nextDouble();
		if (!(n2 >= 0 && n2 <= 10)) {
			System.out.println("Nota inválida");
			System.exit(0);
		}
		
		double media = (n1+n2)/2;
		
		System.out.println("Média:" + media);
		
		if (media >=0 && media < 5.0) {
			System.out.println("Reprovado");
		}else {
			if (media >= 5.0 && media < 7.0) {
				System.out.println("Recuperação");
			}else {
				if (media >= 7.0 && media <= 10.0) {
					System.out.println("Aprovado");
				}else
				{
					System.out.println("Notas inválida!");
				}
			}
		}
		
		sc.close();
	}

}
