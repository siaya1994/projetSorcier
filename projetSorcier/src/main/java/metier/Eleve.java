package metier;

import java.util.List;

import javax.persistence.*;


@Entity
@DiscriminatorValue("eleve")
public class Eleve extends Sorcier {
	
	
	
	private Maison maison;
	
	@ManyToMany
	private List<Matiere> matieres;
	
	
	public Eleve(){}

	
	public Eleve( String nom, String prenom, Integer age, Civilite civ, Patronus patronus, Maison maison, List<Matiere> matieres) {
		super (nom, prenom, age, civ, patronus);
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
