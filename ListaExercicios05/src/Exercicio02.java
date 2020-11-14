
public class Exercicio02 {

	public static void main(String[] args) {
		
		int m[][] = new int[5][5];
		
		for(int i=0;i<=m.length-1;i++) {
			for(int j=0;j<=m[i].length-1;j++) {
				m[i][j] = (int)(Math.random()*10);
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
		
		int soma_lin_4 = 0;
		int soma_col_2 = 0;
        int soma_dig_p = 0;
        int soma_total = 0;
        
		for(int i=0;i<=m.length-1;i++) {
			for(int j=0;j<=m[i].length-1;j++) {
				if (i == 3) {
					soma_lin_4 += m[i][j]; //soma elementos da linha 4
				}
				if (j == 1) {
					soma_col_2 += m[i][j]; //soma coluna 2
				}
				
				if (i == j) {
					soma_dig_p += m[i][j]; //Soma diagonal principal
				}
		        
				soma_total += m[i][j]; //Soma todos os elementos
				
			}
		}
		
		System.out.println("Soma Linha 4    =" + soma_lin_4);
		System.out.println("Soma Coluna 2   =" + soma_col_2);
		System.out.println("Soma Diag. Prin.=" + soma_dig_p);
		System.out.println("Soma total      =" + soma_total);

	}

}
