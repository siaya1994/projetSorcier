package metier;

public enum Civilite {
	m("Monsieur"), mme("Madame"), autre("Autre"), nc("nc");

	private String libelle;

	private Civilite(String civ) {
		libelle = civ;
	}
	
}
