package Ex3_4;

public class Ponto {
   private double x,y;
   
   public Ponto() {
	   this.x = 0;
	   this.y = 0;
   }
   
   public Ponto(double X, double Y) {
	   this.x = X;
	   this.y = Y;
   }
   
   public double getX() {
	   return this.x;
   }
   public double getY() {
	   return this.y;
   }
   
   public boolean Compare(Ponto p) {
	   return this.x == p.getX() && this.y == p.getY();
   }
   
}
