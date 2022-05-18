package game.logic;

import java.util.List;

public class CaseDepart extends Case{

	private static final int changementScore = 0;
	private static final int changementCase = Session.getNonAvancement();
	
	public CaseDepart(int num) {
		super(num);
		super.setCouleur(Couleur.Jaune);
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
