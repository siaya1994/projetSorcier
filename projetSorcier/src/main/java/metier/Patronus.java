package metier;

public enum Patronus {
	M("Monsieur"), Mme("Madame"), Autre("Autre"), NC("NC");

	// Attributs
	private String pat;

	// Constructeur
	private Patronus(String patronus) {
		pat = patronus;
	}

	// Getter
	private String getPatronus() {
		return pat;
	}

}
