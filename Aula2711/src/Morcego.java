
public class Morcego extends Mamifero{
	public void Voar() {
		System.out.println("Morcego - Voar");
	}
	
	@Override
	public void Morrer() {
		//super.Morrer();
		System.out.println("Ozzy!");
	}
}
