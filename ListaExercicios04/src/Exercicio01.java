import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		int[] v = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<v.length;i++) {
			System.out.print("Valor ("+i+"):");
			v[i] = sc.nextInt();
		}
		
		int conta = 0;
		for (int i = 0; i < v.length; i++) {
			
			if (v[i] < 0)
				conta++;
			
			System.out.println(v[i]);
		}
		
		System.out.println("Total de números negativos:" + conta);
		for (int i = 0; i < v.length; i++) {
			if (v[i] < 0)
				System.out.println(v[i]);
		}

	}

}
