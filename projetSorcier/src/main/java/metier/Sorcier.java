package metier;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_sorcier")
@Table(name="sorcier")
public abstract class Sorcier {

	// Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private String prenom;
	private Integer age;
	@Column(name="civilite")
	@Enumerated(EnumType.STRING)
	private Civilite civ;
	@Enumerated(EnumType.STRING)
	private Patronus patronus;

	// Constructeurs

	public Sorcier() {
	}

	public Sorcier(String nom, String prenom, Integer age, Civilite civ, Patronus patronus) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.civ = civ;
		this.patronus = patronus;
	}
	
	public Sorcier(Integer id, String nom, String prenom, Integer age, Civilite civ, Patronus patronus) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.civ = civ;
		this.patronus = patronus;
	}

	// Getters & Setters
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public Civilite getCiv() {
		return civ;
	}

	public Patronus getPatronus() {
		return patronus;
	}

	
	// toString
	
	public String toString() {
		return "Sorcier [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", getCiv()=" + getCiv()
				+ ", getPatronus()=" + getPatronus() + "]";
	}

	
	//Hashcode & egals
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((civ == null) ? 0 : civ.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((patronus == null) ? 0 : patronus.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sorcier other = (Sorcier) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (civ != other.civ)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (patronus != other.patronus)
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}
}
