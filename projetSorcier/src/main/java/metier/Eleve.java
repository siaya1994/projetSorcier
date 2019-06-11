package metier;

import javax.persistence.*;

public class Eleve {
	
	private Maison maison;
	
	@ManyToMany
	private List<Matiere> matieres;
	
	
	public Eleve(){}

	public Eleve(Maison maison, List<Matiere> matieres) {
		super();
		this.maison = maison;
		this.matieres = matieres;
	}

	public Maison getMaison() {
		return maison;
	}

	public void setMaison(Maison maison) {
		this.maison = maison;
	}

	public List<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}


	
	
	
	

}
