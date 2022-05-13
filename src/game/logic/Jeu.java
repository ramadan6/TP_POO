package game.logic;

import java.util.*;
public class Jeu {

	private Set<Joueur> joueurs;
	private Set<Session> sessions;
	private Session activeSession;
	
	// constructors
	public Jeu(Session[] saves, Joueur[] listJoueurs) {
		joueurs = new HashSet<Joueur>();
		sessions = new HashSet<>();
		for(Joueur j : listJoueurs)
			joueurs.add(j);
		for(Session s : saves)
			sessions.add(s);
	}
	
	// getter/setter
	public Set<Joueur> getJoueurs(){
		return joueurs;
	}
	public Set<Session> getSessions(){
		return sessions;
	}
	
	// methods
	public void lancerSession() {
		Scanner s = new Scanner(System.in);
		String nom = s.nextLine(); // a modifier pour une fonction graphique#########################33
		Session newSession = new Session(new Joueur(nom));
		activeSession = newSession;
		// Generer la fenetre
	}
	public void suspendreSession(Session sessionActive) {
		sessions.add(sessionActive);
		
	}
	public void reprendreSession(Session session) {
		if(session.equals(activeSession)) {
			// quitter boite dialogue
			return;
		}
		// Generer la fenetre
		return;
	}
	public void consulterScores(LinkedList<ScoreRecord> scores) { // ArrayList de [ joueur, score] 
		// Fonction pour fenetre des scores
	}
	
}
