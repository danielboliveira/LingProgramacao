import java.util.Scanner;
public class Exercicio15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Notas:");
		double n1 = s.nextDouble();
		double n2 = s.nextDouble();
		double n3 = s.nextDouble();
		
		System.out.print("Média (A/P/H):");
		char op = s.next().charAt(0);
		
		double media = 0;
		switch (op) {
			case 'a':
			case 'A':
				media = (n1+n2+n3)/3;
				break;
			case 'p':
			case 'P':
				media =  (n1*3+n2*3+n3*4)/10;
				break;
			case 'h':
			case 'H':
				if (n1 > 0 && n2 > 0 && n3 > 0) {
					media = 3/(1/n1 + 1/n2 + 1/n3);
				}
				break;
			default:
				System.out.println("Opção inválida");
		}
		
		System.out.println("Média:" + media);

 }
}
