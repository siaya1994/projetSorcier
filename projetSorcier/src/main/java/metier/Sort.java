package metier;

import javax.persistence.*;

@Entity
public class Sort {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String libelle;
	private Matiere matiere;
	private Type_sort type_sort;
	
	
	public Sort() {
	
	}
	
	public Sort(String libelle, Type_sort type_sort) {
		this.libelle = libelle;
		this.type_sort = type_sort;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	public Type_sort getType_sort() {
		return type_sort;
	}
	public void setType_sort(Type_sort type_sort) {
		this.type_sort = type_sort;
	}

	@Override
	public String toString() {
		return "Sort [libelle=" + libelle + ", type_sort=" + type_sort + "]";
	}

	

}
