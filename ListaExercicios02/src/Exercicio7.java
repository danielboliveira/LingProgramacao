import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Salário:");
		double sal = s.nextDouble();
		
		double ir = 0;
		
		if (sal <= 1372.81) {
			ir = 0;
		}else {
			if (sal > 1372.81 && sal <= 2743.25) {
				ir = sal*0.15-205.92;
			}else {
					ir = sal*0.275-548.82;
			}
		}
		
		double sal_liq = sal - ir;
		
		System.out.println("Salário Bruto:" + sal);
		System.out.println("Salário Liq.:" + sal_liq);
		System.out.println("IR:" + ir);
		
		
		s.close();
	}

}
