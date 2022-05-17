package game.logic;

public class CaseMalus extends Case{

	private final int changementScoreMalus = -10;
	private final int changementCaseMalus = -2;
	
	public CaseMalus(int num) {
		super(num);
		super.setCouleur(Couleur.Vert);
	}
	
	@Override
	public int changerScore() {
		return changementScoreMalus;
	}

	@Override
	public int action() {
		return changementCaseMalus;
	}

}
