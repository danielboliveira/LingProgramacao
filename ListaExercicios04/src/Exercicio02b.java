import java.util.Scanner;

public class Exercicio02b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] v = new int[10];
		
		for(int i=0;i<v.length;i++) {
			System.out.print("Valor:");
			v[i] = sc.nextInt();
		}
		
		System.out.print("M:");
		int m = sc.nextInt();
		
		String pos = "";
		for (int i = 0; i < v.length; i++) {
			if (v[i]==m) {
				pos = pos + (i+1) + ",";
			}
		}
		
		if (pos == "") {
			System.out.println("Não foi encontrado o valor no vetor");
		}else {
			System.out.println("Valor encontrado na posição:" + pos.substring(0,pos.length()-1));
		}

	}

}