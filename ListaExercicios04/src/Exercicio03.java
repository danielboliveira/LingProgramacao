
public class Exercicio03 {

	public static void main(String[] args) {
	  int[] v = new int[6];
	  
	  int conta_pares = 0;
	  int conta_impares = 0;
	  String pares = "";
	  String impares = "";
	  
	  for (int i = 0; i < v.length; i++) {
		v[i] = (int)(Math.random()*100);
		System.out.print(v[i] + "\t");
		
		if (v[i] % 2 == 0){
			conta_pares++;
			pares = pares+v[i]+",";
		}else {
			conta_impares++;
			impares = impares+v[i]+",";
		}
		
	  }
	  System.out.println("\n");
	  System.out.println("Total pares:" + conta_pares);
	  System.out.println(pares);
	  System.out.println("Total impares:" + conta_impares);
	  System.out.println(impares);
	  
	  

	}

}
