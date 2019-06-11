package metier;

import java.util.*;

import javax.persistence.*;

@Entity

public class Matiere {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	@OneToMany
	private List<Sort> sort = new ArrayList<Sort>();
	@OneToOne(mappedBy="matiere")
	private Professeur professeur;
	
	
	
	public Matiere() {
		
	}
		
	public Matiere(String nom) {
		this.nom = nom;
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}



	public List<Sort> getSort() {
		return sort;
	}

	public void setSort(List<Sort> sort) {
		this.sort = sort;
	}
	
	public void addSort (Sort sort) {
		this.sort.add(sort);
	}

	@Override
	public String toString() {
		return "Matiere [nom=" + nom + ", sort=" + sort + "]";
	}
	
	
	public Professeur getProfesseur() {
		return professeur;
	}
	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}
	
	
	
	
	

}
