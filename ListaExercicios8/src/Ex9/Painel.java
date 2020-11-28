package Ex9;
import Ex8.Led;

public class Painel {
	private Led[] leds;
	
	public Painel(int quantidade) {
		leds = new Led[quantidade];
		
		for (int i = 0; i < leds.length; i++) {
			leds[i] = new Led();
			leds[i].setCor("Branca");
		}
	}
	
	private boolean CheckIndex(int index) {
		return (index >= 0 && index <= (leds.length-1));
	}
	
	public void Ligar(int index) {
		if (CheckIndex(index)) {
			leds[index].setEstado(true);
		}
	}
	
	public void Desligar(int index) {
		if (CheckIndex(index)) {
			leds[index].setEstado(false);
		}
	}
	
	public void Lista() {
		for (int i = 0; i < leds.length; i++) {
			System.out.println(i + " - " + leds[i].getCor() + " - " + leds[i].getEstado());
		}
	}
	
	public String Display() {
		String aux = "";
		for (int i = 0; i < leds.length; i++) {
			if (leds[i].getEstado())
				aux = aux + "X";
			else
				aux = aux + ".";
		}
		
		return aux;
	}
}
