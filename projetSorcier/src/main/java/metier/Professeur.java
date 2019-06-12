package metier;

import java.util.*;

import javax.persistence.*;

@Entity
@DiscriminatorValue("professeur")
public class Professeur extends Sorcier {

	@OneToOne(mappedBy="professeur")
	private Matiere matiere;

	public Professeur() {
	}

	


	public Professeur(String nom, String prenom, Integer age, Civilite civ, Patronus patronus, Matiere matiere) {
		super(nom, prenom, age, civ, patronus);
		this.matiere = matiere;
	}

	public Professeur(String nom, String prenom, Integer age, Civilite civ, Patronus patronus) {
		super(nom, prenom, age, civ, patronus);
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public void addProf(Maison m) {
		
		
	}

}
