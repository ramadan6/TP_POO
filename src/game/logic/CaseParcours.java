package game.logic;

public class CaseParcours extends Case {

	private final int changementScoreParcours = 0;
	private final int changementCaseParcours = 0;
	
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
		return changementCaseParcours;
	}

}
