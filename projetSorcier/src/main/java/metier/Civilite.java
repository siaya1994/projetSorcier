package metier;

public enum Civilite {
	M("Monsieur"), Mme("Madame"), Autre("Autre"), NC("NC");

	// Attributs
	private String libelle;

	// Constructeur
	private Civilite(String civ) {
		libelle = civ;
	}

	// Getter
	public String getLibelle() {
		return libelle;
	}
}
