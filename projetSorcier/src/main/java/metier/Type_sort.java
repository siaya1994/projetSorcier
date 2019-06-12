package metier;

public enum Type_sort {
	
	enchantement("Enchantement"),malefice("Malefice"),malediction("Malediction"),sortilege("Sortilege");
	
	private String libelle;
	private Type_sort (String type_sort){
		
		libelle = type_sort;
		
	}

}
