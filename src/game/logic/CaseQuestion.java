package game.logic;

abstract class CaseQuestion extends Case{

	
	protected boolean correct;
	
	public CaseQuestion(int num) {
		super(num);
	}
	
	public static CaseQuestion genQuestionDefinition() {
		return null;
	}
	public static CaseQuestion genQuestionImage() {
		return null;
	}
	
	protected abstract boolean questionner();
}
