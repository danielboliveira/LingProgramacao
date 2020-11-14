import java.util.Calendar;
public class Exercicio_n2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] idade = ObterIdade(25, 12, 2001);
		
		System.out.println(idade[0]+" anos e " + idade[1] + " meses e " + idade[2] + " dias");
		
	}
	
	static int[] ObterIdade(int diaN,int mesN,int anoN) {
		int[] idade = new int[3];
		
		Calendar cal = Calendar.getInstance();
		
		int dia = cal.get(Calendar.DAY_OF_MONTH);
		int mes = cal.get(Calendar.MONTH) + 1;
		int ano = cal.get(Calendar.YEAR);
		
		int difDias = (dia + mes*30 + ano*365) - (diaN + mesN*30 + anoN*365);
		
		idade[0] = difDias / 365;
		idade[1] = (difDias % 365) / 30;
		idade[2] = (difDias % 365) % 30;
		
		return idade;
		
		
	}

}
