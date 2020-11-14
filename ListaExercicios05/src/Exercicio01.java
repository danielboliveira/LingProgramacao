import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m[][] = new int[6][6];
		
		for(int i=0;i<=m.length-1;i++) {
			for(int j=0;j<=m[i].length-1;j++) {
				m[i][j] = (int)(Math.random()*10);
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
		
		int a;
		
		System.out.println();
		
		System.out.println("Informe o valor A:");
		a = sc.nextInt();
		
		System.out.println();
		
		for(int i=0;i<=m.length-1;i++) {
			for(int j=0;j<=m[i].length-1;j++) {
				m[i][j] = m[i][j]*a;
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
		
		

	}

}
