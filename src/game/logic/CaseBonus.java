package game.logic;

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
	public Case action(List<Case> plateau) {
		// TODO Auto-generated method stub
		return changementCaseBonus;
	}
	
}
