package game.logic;

public class CaseDepart extends Case{

	public CaseDepart(int num) {
		super(num);
		super.setCouleur(Couleur.Jaune);
	}

	@Override
	public int changerScore() {
		return 0;
	}

	@Override
	Case action() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
