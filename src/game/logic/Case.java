package game.logic;

import java.util.List;

public abstract class Case {
	
	int numCase;
	Couleur couleur;
	
	// Constructor
	public Case(int num) {
		this.numCase = num;
	}
	
	// getter/setter
	public int getNum() {
		return this.numCase;
	}
	public Couleur getCouleur() {
		return this.couleur;
	}
	public void setNum(int num) {
		this.numCase = num;
	}
	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}
	
	// methods
	public abstract int changerScore();
	public abstract int action();
	
}
