
public class Exercicio13 {

	public static void main(String[] args) {
		double v[] = new double[20];
		
		double soma  = 0;
		double x_med = 0;
		
		for(int i =0;i<v.length;i++) {
			v[i] = Math.random()*100;
			System.out.println(v[i]);
			soma = soma + v[i];
		}
		
		x_med = soma / v.length;
		
		double x_dif = 0;
		for (int i = 0; i < v.length; i++) {
			x_dif = x_dif + Math.pow(v[i]-x_med, 2);
		}
		
		double variancia = x_dif / v.length;
		
		double desvp = Math.sqrt(variancia);
		
		System.out.println();
		System.out.println("x_med = " + x_med);
        System.out.println("variancia = " + variancia);
        System.out.println("Desvio Padrão = " + desvp);
		

	}

}
