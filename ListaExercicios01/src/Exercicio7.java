import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("P1(x1,y1):");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		System.out.println("P2(x2,y2):");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double dx = x2 - x1;
		double dy = y2 - y1;
		
		double d = Math.sqrt(dx*dx + dy*dy);
		
		System.out.printf("Distância:%.3f",d);
		
		sc.close();
	}

}
