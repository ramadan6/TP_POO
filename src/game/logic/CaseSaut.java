package game.logic;
import java.util.List;
import java.util.Random;

public class CaseSaut extends Case{

	private static final int changementScore = 0;
	
	
	public CaseSaut(int num) {
		super(num);
		couleur = Couleur.Orange;
	}

	@Override
	public int changerScore() {
		return changementScore;
	}

	@Override
	public int action() {
		Random r = new Random();
		int number = r.nextInt(Session.getMaxCases() - 2) + 1; // entre 1 et 98 (indice dans array)
		// foncion pour afficher graphiquement le changement
		return number;
	}

}
