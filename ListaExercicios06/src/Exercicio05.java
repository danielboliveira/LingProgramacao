import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dia:");
		int d = sc.nextInt();
		System.out.println("Mês:");
		int m = sc.nextInt();
		
		System.out.println("Total dias:" + ContarDias(d, m));

	}
	
	static int ContarDias(int dia,int mes) {
		int aux = (mes-1)*30 + dia;
		return aux;
	}

}
