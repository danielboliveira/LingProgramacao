import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("KM inicial:");
		double km_inicial = sc.nextDouble();
		
		System.out.print("KM final:");
		double km_final = sc.nextDouble();
		
		System.out.print("Total combustível:");
		double volume = sc.nextDouble();
		
		double consumo = (km_final - km_inicial)/volume;
		
		System.out.println("Consumo (km/l):" + consumo);
		
		sc.close();

	}

}
