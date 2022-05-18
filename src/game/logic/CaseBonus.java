package game.logic;

import java.util.List;

public class CaseBonus extends Case{

	private final int changementScoreBonus = 10;
	private final int changementCaseBonus = 2;
	
	public CaseBonus(int num) {
		super(num);
		super.setCouleur(Couleur.Vert);
	}
	
	@Override
	public int changerScore() {
		return changementScoreBonus;
	}

	@Override
	public int action() {
		return changementCaseBonus;
	}
	
}
