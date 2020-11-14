
public class Execicio05 {

	public static void main(String[] args) {
		int m[][] = new int[10][10];
			
		double soma = 0;
		for(int i=0;i<=m.length-1;i++) {
		   for(int j=0;j<=m[i].length-1;j++) {
					m[i][j] = (int)(Math.random()*100);
					
					if (i == j)
					 soma = soma + m[i][j];
					
					System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Média = " + (soma/10));

	}

}
