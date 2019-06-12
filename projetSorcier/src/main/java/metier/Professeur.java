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

	public Professeur(Matiere matiere) {
		super();
		this.matiere = matiere;
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
