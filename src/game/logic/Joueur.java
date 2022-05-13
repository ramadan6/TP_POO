package game.logic;

import java.util.*;

public class Joueur {
	
	private String nom;
	private int highScore;
	private static ScoreRecord top;
	
	// constructors
	public Joueur(String nom) {
		this.nom = nom;
		highScore = 0;
	}
	public Joueur() {}
	
	// getter/setter
	public void setHighScore(int score) {
		this.highScore = score;
	}
	public static void setTop(ScoreRecord top) {
		Joueur.top = top;
	}
	
	// methods
	public static void loadHighScore(LinkedList<ScoreRecord> scores) {
		setTop(scores.getFirst());
	}
	
	
}
