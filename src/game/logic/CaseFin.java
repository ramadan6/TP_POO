package game.logic;

import java.util.List;

public class CaseFin extends Case{

	private static final int changementScore = 0;
	private static final int changementCase = Session.getNonAvancement();
	
	
	public CaseFin(int num) {
		super(num);
		super.setCouleur(Couleur.Noir);
	}

	@Override
	public int changerScore() {
		return changementScore;
	}


	@Override
	public int action() {
		return changementCase;
	}

}
