import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("A:");
		a = sc.nextInt();
		
		System.out.print("B:");
		b = sc.nextInt();
		
		System.out.print("C:");
		c = sc.nextInt();
		
		double media = (2.0*a + 3.0*b + 5.0*c)/10.0;
		
		System.out.println(media);
	}

}
