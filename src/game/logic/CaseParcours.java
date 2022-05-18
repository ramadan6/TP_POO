package game.logic;

import java.util.List;

public class CaseParcours extends Case {

	private final int changementScoreParcours = 0;
	private final int changementCaseParcours = Session.getNonAvancement();
	
	public CaseParcours(int num) {
		super(num);
		super.setCouleur(Couleur.Vert);
	}
	
	@Override
	public int changerScore() {
		return changementScoreParcours;
	}

	@Override
	public int action() {
		// TODO Auto-generated method stub
		return changementCaseParcours;
	}

}
