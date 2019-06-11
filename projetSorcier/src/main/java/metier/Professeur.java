package metier;

import java.util.*;

import javax.persistence.*;

public class Professeur {

@OneToOne
private Matiere matiere ;


public Professeur(){}

public Professeur(List<Matiere> matieres) {
	super();
	this.matieres = matieres;
	
}

public List<Matiere> getMatieres() {
	return matieres;
}

public void setMatieres(List<Matiere> matieres) {
	this.matieres = matieres;
}




}
