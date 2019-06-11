package metier;

import java.util.*;

import javax.persistence.*;

@DiscriminatorValue("professeur")
public class Professeur extends Sorcier{

@OneToOne
private Matiere matiere ;


public Professeur(){}


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






}
