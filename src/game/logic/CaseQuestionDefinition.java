package game.logic;

public class CaseQuestionDefinition extends CaseQuestion{

	private static final int changementScoreGain = 10; 
	private static final int changementScorePerte = 10; 
	private boolean valReponse;

	public CaseQuestionDefinition(int num) {
		super(num);
		this.couleur = Couleur.Rose;
	}
	public int changerScore() {
		if(valReponse = questionner())
			return changementScoreGain;
		return changementScorePerte;
	}
	@Override
	int action() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	protected boolean questionner() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
