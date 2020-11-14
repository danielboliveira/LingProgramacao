package Ex4;

public class Contador {
   private int valor;
   
   public void Zerar() {
	   valor = 0;
   }
   
   public void Incrementar() {
	   valor = valor + 1;
   }
   
   public int getContador() {
	   return this.valor;
   }
}
