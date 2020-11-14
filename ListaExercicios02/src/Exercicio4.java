import java.util.Scanner;
import java.util.Calendar;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome A:");
		String nomea = sc.next();
		System.out.print("Idade A:");
		int idadea = sc.nextInt();
		
		System.out.print("Nome B:");
		String nomeb = sc.next();
		System.out.print("Idade B:");
		int idadeb = sc.nextInt();
		
		//System.out.print("Ano atual:");
		//int ano = sc.nextInt();
		Calendar c = Calendar.getInstance();
		int ano = c.get(Calendar.YEAR);
		
		if (idadea < idadeb) {
			System.out.println(nomea);
			System.out.println(ano - idadea);
		}else {
			System.out.println(nomeb);
			System.out.println(ano - idadeb);
		}
		
		sc.close();
		

	}

}
