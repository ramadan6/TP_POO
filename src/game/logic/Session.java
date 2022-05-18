package game.logic;

import java.util.*;

public class Session {

	private final static int MAX_CASES = 100;
	private final static int NON_AVANCEMENT = -100;
	private Joueur joueur;
	private int score;
	private Case caseCourante;
	private boolean finPartie;
	private ArrayList<Case> plateau;
	private De dice = new De();
	
	
	// Constructors
	public Session(Joueur joueur) {
		initPlateau();
		this.joueur = joueur;
		score = 0;
		caseCourante = plateau.get(0);
		finPartie = false;
	}
	
	// getter/setter
	public static int getNonAvancement() {
		return NON_AVANCEMENT;
	}
	public static int getMaxCases() {
		return MAX_CASES;
	}
	
	
	// methods
	private void initPlateau() {
		plateau = new ArrayList<Case>(MAX_CASES - 1); // les indices commence de 0
		plateau.set(0, new CaseDepart(0));
		plateau.set(MAX_CASES - 1, new CaseFin(MAX_CASES));
		Random r = new Random();
		int randomInt = 0;
		for(int i = 0; i<5; ++i) {
			while(plateau.get(randomInt) != null) {
				randomInt = r.nextInt(MAX_CASES - 2) + 1;
			}
			while(plateau.get(randomInt) != null) {
				randomInt = r.nextInt(MAX_CASES - 2) + 1;
			}
			plateau.set(randomInt, new CaseMalus(randomInt + 1));
			while(plateau.get(randomInt) != null) {
				randomInt = r.nextInt(MAX_CASES - 2) + 1;
			}
			plateau.set(randomInt, new CaseQuestion.genQuestionDefinition(randomInt + 1));
			while(plateau.get(randomInt) != null) {
				randomInt = r.nextInt(MAX_CASES - 2) + 1;
			}
			plateau.set(randomInt, new CaseQuestion.genQuestionImage(randomInt + 1));
			while(plateau.get(randomInt) != null) {
				randomInt = r.nextInt(MAX_CASES - 2) + 1;
			}
			plateau.set(randomInt, new CaseSaut(randomInt + 1));
		}
		for(int i = 1; i<MAX_CASES - 1; i++) {
			if(plateau.get(i) != null)
				plateau.set(i, randomCase(i + 1));
		}
	}
	private Case randomCase(int num) {
		Random r = new Random();
		switch (r.nextInt(6) + 1) {
			case 1:
				return new CaseParcours(num);
			case 2:
				return new CaseBonus(num);
			case 3:
				return new CaseMalus(num));
			case 4:
				return CaseQuestion.genQuestionDefinition(num);
			case 5:
				return CaseQuestion.genQuestionImage(num);
			case 6:
				return new CaseSaut(num);
			default:
				return null;
		}
	}
	
	public boolean finished() {
		return finPartie;
	}
	private boolean verifierCaseChoisie(Case caseDes, Case choixJoueur) {
		return caseDes == choixJoueur;
	}
	public int avancer(int indice) { // avance a c et retourne a quelle case il va etre dirige ( peut etre null)
		// fonction pour avancer graphiquement
		caseCourante = plateau.get(indice);
		if(caseCourante == plateau.get(MAX_CASES - 1))
			finPartie = true;
		score += plateau.get(indice).changerScore();
		int incriment  = plateau.get(indice).action(plateau);
		if(indice + incriment < MAX_CASES) return indice + incriment;
		if(indice + incriment < 0) return 0;
		return indice - incriment;
	}

	public void jouer(int indice) {
		Case c = plateau.get(indice);
		if(indice == NON_AVANCEMENT)
			return;
		// eventListner for button qui vas verifier qui est egale a c
		Case choixJoueur;
		if(verifierCaseChoisie(c, choixJoueur)){
			jouer(avancer(indice));
		}
		else {
			// message d'erreur
			jouer(indice);
		}
	}
	
	public void tour_a_rouler() { // in main while not finPartie() on fait tour a rouler
		int nbCaseAvancement = dice.rouler();
		int numCaseCourante = caseCourante.getNum();
		if(numCaseCourante + nbCaseAvancement > MAX_CASES)
			jouer(numCaseCourante + (numCaseCourante + nbCaseAvancement - MAX_CASES));
		else
			jouer(numCaseCourante + nbCaseAvancement);
	}
	
	
	
}
