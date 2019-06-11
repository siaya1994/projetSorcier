package metier;

import java.util.*;

import javax.persistence.*;

public class Maison {
	
	private String nom;
	private Integer score;
	@OneToOne
	private Professeur professeur;
	@OneToMany
	private List<Eleve> eleves = new ArrayList();
	
	public Maison (){}
	
	public Maison(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return "Maison [nom=" + nom + ", score=" + score + ", professeur=" + professeur + ", eleves=" + eleves + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Professeur getProfesseur() {
		return professeur;
	}

	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}

	public List<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}
	
	public void addE(Eleve e){
		this.eleves.add(e);
	}
	
}
	


