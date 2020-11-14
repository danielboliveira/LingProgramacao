import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] v = new int[10];
		
		for(int i=0;i<v.length;i++) {
			System.out.print("Valor:");
			v[i] = sc.nextInt();
		}
		
		System.out.print("M:");
		int m = sc.nextInt();
		
		int pos = -1;
		for (int i = 0; i < v.length; i++) {
			if (v[i]==m) {
				pos = i;
				break;
			}
		}
		
		if (pos == -1) {
			System.out.println("Não foi encontrado o valor no vetor");
		}else {
			System.out.println("Valor encontrado na posição:" + pos);
		}

	}

}
