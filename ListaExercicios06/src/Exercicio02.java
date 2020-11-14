
public class Exercicio02 {

	public static void main(String[] args) {
		
		System.out.println(Fatorial(2));
		System.out.println(Fatorial(3));
		System.out.println(Fatorial(4));
		System.out.println(Fatorial(5));
						

	}
	
	static long Fatorial(int n) {
		long fat = 1;
		
		for(int i=n;i>0;i--) {
			fat = fat * i;
		}
		
		return fat;
		
	}

}
