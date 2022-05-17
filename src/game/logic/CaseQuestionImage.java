package game.logic;

public class CaseQuestionImage extends CaseQuestion{
	private static final int changementScore = 10; 

	public CaseQuestionImage(int num) {
		super(num);
		this.couleur = Couleur.Rose;
	}
	public int changerScore() {
		return changementScore;
	}
	@Override
	Case action() {
		// TODO Auto-generated method stub
		return null;
	}
}