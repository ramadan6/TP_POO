package game.logic;

import java.util.*;

public class Session {

	private Joueur joueur;
	private int score;
	private Case caseCourante;
	private boolean finPartie;
	private ArrayList<Case> plateau;
	private De dice = new De();
	
	
	// Constructors
	public Session(Joueur joueur) {
		plateau.addFirst(new CaseFin());
		for(int i = 1; i<62; i++) {
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
	private boolean verifierCaseChoisie(Case caseDes, Case choixJoueur) {
		return caseDes == choixJoueur;
	}
	public Case avancer(Case c) { // avance a c et retourne a quelle case il va etre dirige ( peut etre null)
		// fonction pour avancer graphiquement
		caseCourante = c;
		if(c == plateau.get(63))
			finPartie = true;
		c.changerScore();
		c.changerCase();
		return c.action();
	}
	public void jouer(Case c) {
		if(c == null)
			return;
		// eventListner for button qui vas verifier qui est egale a c
		Case choixJoueur;
		if(verifierCaseChoisie(c, choixJoueur){
			jouer(avancer(c));
		}
		else {
			// message d'erreur
			jouer(c);
		}
		
	}
	
	
}
