package game.logic;

import java.util.List;

public class CaseQuestionImage extends CaseQuestion{
	
	private static final int changementScoreGain = 10; 
	private static final int changementScorePerte = 0; 
	private static final int changementCaseGain = 2;
	private static final int changementCasePerte = Session.getNonAvancement();
	
	
	public CaseQuestionImage(int num) {
		super(num);
		this.couleur = Couleur.Rose;
	}
	public int changerScore() {
		return changementScore;
	}
	@Override
	protected boolean questionner() {
		boolean reponse = false;
		// TODO Auto-generated method stub
		this.correct = reponse;
		return reponse;
	}
	@Override
	public int action() {
		if(this.correct ) return changementCaseGain;
		return changementCasePerte;
	}
}