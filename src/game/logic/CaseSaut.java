package game.logic;
import java.util.Random;

public class CaseSaut extends Case{

	public CaseSaut(int num) {
		super(num);
		couleur = Couleur.Orange;
	}

	@Override
	public int changerScore() {
		Random r = new Random();
		int number = r.nextInt(Session.getMaxCases() - 2) + 1; // entre 1 et 98 (indice dans array)
		// foncion pour afficher graphiquement le changement
		return number;
		
	}

	@Override
	Case action() {
		// TODO Auto-generated method stub
		return null;
	}

}
