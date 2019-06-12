package test;

import java.util.Scanner;
import dao.*;
import metier.*;

public class TestConsole {

	public static void main(String[] args) {
		console();
	}

	static Scanner clavierInt = new Scanner(System.in);
	static int choixI = clavierInt.nextInt();
	static Scanner clavierStr = new Scanner(System.in);

	static Maison maisonSelect;
	static Eleve eleveSelect;

	static DaoProfesseur daoP = new DaoProfesseur();
	static DaoEleve daoE = new DaoEleve();
	static DaoMaison daoMai = new DaoMaison();
	static DaoMatiere daoMat = new DaoMatiere();
	static DaoSort daoS = new DaoSort();
	
//ok
	public static void console() {

		System.out.println(
				" Je jure solennellement que mes intentions sont mauvaises! \nQuelle carte de gestion de l'école voulez-vous voir? \nLes Maisons -> 1 \nLes Elèves -> 2 "
						+ "\nLes professeurs -> 3 \nLes matières -> 4 \nMéfait accompli -> 5");

		switch (choixI) {
		case 1:
			gestionMaisons();
			break;
		case 2:
			gestionEleves();
			break;
		case 3:
			gestionProfs();
			break;
		case 4:
			gestionMatieres();
			break;
		case 5:
			System.out.println("A bientôt");
			break;

		default:
			System.out.println("ERREUR, veuillez taper le chiffre correspondant à la carte de gestion demandée");
		}

	}

	//ok
	public static void gestionMaisons() {
		System.out.println(
				"GESTION DES MAISONS! \nQuelles sont vos intentions? \nAjouter une maison -> 1 \nConsulter une maison -> 2 "
						+ "\nRetourner à la carte de gestion de l'école -> 3 \nMéfait accompli -> 4");
		switch (choixI) {
		case 1:

			addMaison();
			break;
		case 2:
			seeMaison();
			break;
		case 3:
			console();
			break;
		case 4:
			System.out.println("A bientôt");
			break;
		default:
			System.out.println("ERREUR, veuillez taper le chiffre correspondant à la carte de gestion demandée");
		}
	}

	// ok
	public static void addMaison() {
		System.out.print("Nom de la maison?");
		String nom = clavierStr.nextLine().toLowerCase();
		Maison maiG = new Maison("nom");
		daoMai.insert(maiG);
	}
	//ok
	public static void seeMaison() {
		System.out.println(
				"Choisir une maison :  \nGryffondor -> 1 \nPoufsouffle -> 2 " + "\nSerdaigle -> 3 \nSerpentard -> 4");
		switch (choixI) {
		case 1:
			System.out.println(daoMai.selectByName("gryffondor"));
			maisonSelect = "gryffondor";
			updateMaison();
			break;
		case 2:
			System.out.println(daoMai.selectByName("poufsouffle"));
			maisonSelect = "poufsouffle";
			updateMaison();
			break;
		case 3:
			System.out.println(daoMai.selectByName("serdaigle"));
			maisonSelect = "serdaigle";
			updateMaison();
			break;
		case 4:
			System.out.println(daoMai.selectByName("serpentard"));
			maisonSelect = "serpentard";
			updateMaison();
			break;
		default:
			System.out.println("ERREUR, veuillez taper le chiffre correspondant à la carte de gestion demandée");
		}
	}

	//ok
	private static void updateMaison() {

		System.out.println("Quelles sont vos intentions? \nAjouter des points -> 1 \nAjouter un élève -> 2 "
				+ "\nChanger de professeur principal -> 3 \nMéfait accompli -> 4");
		switch (choixI) {
		case 1:
			updatePts();
			break;
		case 2:
			selectEleve();
			break;
		case 3:
			selectProf();
			break;
		case 4:
			// System.exit(); a mettre à chaque fin
			System.out.println("A bientôt");
			break;
		default:
			System.out.println("ERREUR, veuillez taper le chiffre correspondant à la carte de gestion demandée");
		}

	}

	private static void updatePts() {
		System.out.println("Combien de points voulez-vous ajouter à la maison?");
		Integer addpts = clavierInt.nextInt();
		maisonSelect.addPts(addpts);
	}

	private static void selectEleve() {
		for (Eleve e : daoE.selectAll()) {
			System.out.println(e);
		}
		System.out.println("Sélectionner le nom de l'élève à ajouter à la maison?");
		String nom = clavierStr.nextLine().toLowerCase();
		
		Eleve e = daoE.selectByName("nom");
		maisonSelect.addE(e);
		e.setMaison(maisonSelect);
	
		}

	private static void selectProf() {
		for (Professeur p : daoP.selectAll()) {
			System.out.println(p);
		}
		System.out.println("Choisir le nouveau professeur principal de la maison?");
		String nom = clavierStr.nextLine().toLowerCase();
		
		Professeur p = daoP.selectByName("nom");
		Maison m = daoMai.selectByName(maisonSelect);
		
		m.setProfesseur(p);
		
		
	}

	private static void gestionEleves() {
		System.out.println(
				"GESTION DES ELEVES! \nQuelles sont vos intentions? \nAjouter un(e) élève -> 1 \nModifier un élève -> 2 "
						+ "\nRetourner à la carte de gestion de l'école -> 3 \nMéfait accompli -> 4");
		switch (choixI) {
		case 1:
			addEleve();
			break;
		case 2:
			System.out.println("choisissez un eleve a modifer: ");
			String prenom = clavierStr.nextLine().toLowerCase();
			eleveSelect = daoE.selectByName(prenom);
			updateEleve();
			break;
		case 3:
			console();
			break;
		case 4:
			System.out.println("A bientôt");
			break;
		default:
			System.out.println("ERREUR, veuillez taper le chiffre correspondant à la carte de gestion demandée");
		}
	}

	private static void addEleve() {
		System.out.print("Nom?");
		String nom = clavierStr.nextLine().toLowerCase();
		System.out.print("Prénom?");
		String prenom = clavierStr.nextLine().toLowerCase();
		System.out.print("Age?");
		Integer age = clavierStr.nextInt();
		System.out.print("M / Mme?");
		Civilite civ = Civilite.valueOf(clavierStr.nextLine());
		Maison maiG = new Maison("nom");
		System.out.print("Patronus?");
		Patronus patronus = Patronus.valueOf(clavierStr.nextLine());

		Eleve e = new Eleve(nom, prenom, age, civ, patronus);
		daoMai.insert(maiG);
	}


	public static void updateEleve() {
		System.out.println("Quelles sont vos intentions? \nChoisir une maison -> 1 \nChoisir une matière -> 2 "
				+ "\nAfficher les sorts -> 3 \nMéfait accompli -> 4");
		switch (choixI) {
		case 1:
			System.out.println("choisissez la maison a lui affecter : ");
			String maison = clavierStr.nextLine().toLowerCase();		
			eleveSelect.setMaison(daoMai.selectByName(maison));
			break;
		case 2:
			System.out.println("choisissez une matière a lui affecter : ");
			String matiere = clavierStr.nextLine().toLowerCase();		
			eleveSelect.addMatiere(daoMat.selectByName(matiere));
			break;
		case 3:
			for (Matiere m : eleveSelect.getMatieres())
			System.out.println(m);
			break;
		case 4:
			System.out.println("A bientôt");
			break;
		default:
			System.out.println("ERREUR, veuillez taper le chiffre correspondant à la carte de gestion demandée");
		}

	}

	private static void gestionProfs() {
		System.out.println(
				"GESTION DES PROFESSEURS! \nQuelles sont vos intentions? \nAjouter un professeur -> 1 \nModifier un professeur -> 2 "
						+ "\nRetourner à la carte de gestion de l'école -> 3 \nMéfait accompli -> 4");
		switch (choixI) {
		case 1:
			addProf();
			break;
		case 2:
			updateProf();
			break;
		case 3:
			console();
			break;
		case 4:
			System.out.println("A bientôt");
			break;
		default:
			System.out.println("ERREUR, veuillez taper le chiffre correspondant à la carte de gestion demandée");
		}

	}

	private static void addProf() {
		System.out.print("Nom?");
		String nom = clavierStr.nextLine().toLowerCase();
		System.out.print("Prénom?");
		String prenom = clavierStr.nextLine().toLowerCase();
		System.out.print("Age?");
		Integer age = clavierStr.nextInt();
		System.out.print("M / Mme?");
		Civilite civ = Civilite.valueOf(clavierStr.nextLine().toLowerCase());
		System.out.print("Patronus?");
		Patronus patronus = Patronus.valueOf(clavierStr.nextLine().toLowerCase());
		System.out.print("Matière?");
		String matiere = clavierStr.nextLine().toLowerCase();
		daoMat.selectByName(matiere);
		
		Professeur p = new Professeur (nom, prenom, age, civ, patronus);
		p.setMatiere(daoMat.selectByName(matiere));
		daoP.insert(p);
		
	}

	private static void updateProf() {
		System.out.println("Quel est le nom du professeur?");
		String nom = clavierStr.nextLine().toLowerCase();
		System.out.println("Quelle est sa nouvelle matière?");
		String matiere = clavierStr.nextLine().toLowerCase();
		
		Professeur p = daoP.selectByName(nom);
		p.setMatiere(daoMat.selectByName(matiere));
		
	}

	private static void gestionMatieres() {
		System.out.println(
				"GESTION DES MATIERES! \nQuelles sont vos intentions? \nAjouter une matière -> 1 \nModifier une matière -> 2 "
						+ "\nRetourner à la carte de gestion de l'école -> 3 \nMéfait accompli -> 4");
		switch (choixI) {
		case 1:
			addMatiere();
			break;
		case 2:
			updateMatiere();
			break;
		case 3:
			console();
			break;
		case 4:
			System.out.println("A bientôt");
			break;
		default:
			System.out.println("ERREUR, veuillez taper le chiffre correspondant à la carte de gestion demandée");
		}

	}

}
