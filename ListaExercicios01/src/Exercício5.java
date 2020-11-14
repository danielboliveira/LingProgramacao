import java.util.Scanner;
public class Exercício5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("C°:");
		double c = sc.nextDouble();
		
		double f = (9.0/5)*c + 32;
		
		System.out.printf("F°:%.2f",f);
		
		sc.close();

	}

}
