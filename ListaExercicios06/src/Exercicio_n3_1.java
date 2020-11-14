import java.util.Scanner;

public class Exercicio_n3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int op = 0;
		
		do {
			System.out.println();
			System.out.println("1 - Converter HMS -> Segundos");
			System.out.println("2 - Converter Segundos -> HMS");
			System.out.println("0 - Sair");
			op = sc.nextInt();
			
			switch (op) {
			   case 1:
				  System.out.println();
				  System.out.print("H:M:S");
				  int hora = sc.nextInt();
				  int min = sc.nextInt();
				  int seg = sc.nextInt();
				  
				  System.out.println("Total segundos:" + Converter_HMS_Segundos(hora, min, seg));
				  break;
				  
			   case 2:
				   System.out.println();
				   System.out.print("Total segundos:");
				   int total = sc.nextInt();
				   int[] t = Converter_Segundos_HMS(total);
				   System.out.println(t[0]+":"+t[1]+":"+t[2]);
				   break;
			   case 0:
				   System.out.println("Saindo!");
				   break;
			   default:
				   System.out.println("Opção inválida!");
					   
			}
			
			
			
		}while(op != 0);
		
	}
	
	static int Converter_HMS_Segundos(int horas,int minutos, int segundos) {
		return horas*3600+minutos*60+segundos;
	}
	
	static int[] Converter_Segundos_HMS(int totalSegundos) {
		int[] t = new int[3];
		
		t[0] = totalSegundos/3600;
		t[1] = (totalSegundos%3600)/60;
		t[2] = (totalSegundos%3600)%60;
		
		return t;
	}

}
