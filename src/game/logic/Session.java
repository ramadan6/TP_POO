package game.logic;

import java.util.*;

public class Session {

	private Joueur joueur;
	private int score;
	private Case caseCourante;
	private boolean finPartie;
	private LinkedList<Case> plateau;
	private De dice = new De();
	
	
	// Constructors
	public Session(Joueur joueur) {
		plateau.addFirst(new CaseFin());
		for(int i = 1; i<99; i++) {
			plateau.addFirst(randomCase());
		}
		plateau.addFirst(new CaseDepart());
		this.joueur = joueur;
		score = 0;
		caseCourante = plateau.getFirst();
		finPartie = false;
	}
	
	// getter/setter
	
	
	
	// methods
	private Case randomCase() {
		Random r = new Random();
		switch (r.nextInt(5) + 1) {
			case 1:
				return new CaseParcourt();
			case 2:
				return new CaseBonus();
			case 3:
				return new CaseMalus();
			case 4:
				return CaseQuestion.genQuestion();
			case 5:
				return new CaseSaint();
			default:
				return null;
		}
	}
	private boolean finished() {
		return finPartie;
	}
	public boolean jouer(int diceNum, int ) {
		
	}
	
	
}
