package game.logic;

import java.util.List;

public class CaseQuestionDefinition extends CaseQuestion{

	private static final int changementScoreGain = 20; 
	private static final int changementScorePerte = -10; 
	private static final int changementCaseGain = 4;
	private static final int changementCasePerte = Session.getNonAvancement();
	
	
	public CaseQuestionDefinition(int num) {
		super(num);
		this.couleur = Couleur.Bleu;
	}

	public int changerScore() {
		if(questionner())
			return changementScoreGain;
		return changementScorePerte;
	}
	
	@Override
	public int action() {
		if(this.correct ) return changementCaseGain;
		return changementCasePerte;
	}
	
	@Override
	protected boolean questionner() {
		boolean reponse = false;
		// TODO Auto-generated method stub
		this.correct = reponse;
		return reponse;
	}
	
}
