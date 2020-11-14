import java.util.Scanner;
public class Exercício6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor:");
		int x = sc.nextInt();
		
		System.out.println(3*x);
		System.err.println(x/2.0);
		System.out.println(Math.cbrt(x));
		System.out.println(Math.pow(x, 2.0/3));
		
		sc.close();
	}

}
