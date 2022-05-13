package game.logic;

public class ScoreRecord {
	
	private Joueur joueur;
	private int score;
	
	// Constructor
	private ScoreRecord(Joueur joueur, int score) {
		this.joueur = joueur;
		this.score = score;
	}
	
	// getter/setter
	public Joueur getJoureur() {
		return this.joueur;
	}
	public int getScore() {
		return this.score;
	}
	
}
