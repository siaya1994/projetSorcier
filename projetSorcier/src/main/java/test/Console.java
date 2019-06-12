package test;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		console();
	}

	static Scanner clavierint = new Scanner(System.in);
	static int choix = clavierint.nextInt();

	public static void console() {

		System.out.println(
				" Je jure solennellement que mes intentions sont mauvaises! \nQuelle carte de gestion de l'école voulez-vous voir? \nLes Maisons -> 1 \nLes Elèves -> 2 "
						+ "\nLes professeurs -> 3 \nLes matières -> 4 \nMéfait accompli -> 5");

		switch (choix) {
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

	public static void gestionMaisons() {
		System.out.println(
				"GESTION DES MAISONS! \nQuelles sont vos intentions? \nAjouter une maison -> 1 \nConsulter une maison -> 2 "
						+ "\nRetourner à la carte de gestion de l'école -> 3 \nMéfait accompli -> 4");
		switch (choix) {
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

	public static void addMaison() {
	}

	public static void seeMaison() {
		System.out.println(
				"Choisir une maison :  \nGryffondor -> 1 \nPoufsouffle -> 2 " + "\nSerdaigle -> 3 \nSerpentard -> 4");
		switch (choix) {
		case 1:
			System.out.println("Maison Gryffondor :");
			updateMaison();
			break;
		case 2:
			System.out.println("Maison Poufsouffle :");
			updateMaison();
			break;
		case 3:
			System.out.println("Maison Serdaigle :");
			updateMaison();
			break;
		case 4:
			System.out.println("Maison Serpentard :");
			updateMaison();
			break;
		default:
			System.out.println("ERREUR, veuillez taper le chiffre correspondant à la carte de gestion demandée");
		}
	}

	public static void updateMaison() {
		System.out.println("Quelles sont vos intentions? \nAjouter des points -> 1 \nAjouter un élève -> 2 "
				+ "\nChanger de professeur principal -> 3 \nMéfait accompli -> 4");
		switch (choix) {
		case 1:
			addpoints();
			break;
		case 2:
			selectEleve();
			break;
		case 3:
			selectProf();
			break;
		case 4:
			System.out.println("A bientôt");
			break;
		default:
			System.out.println("ERREUR, veuillez taper le chiffre correspondant à la carte de gestion demandée");
		}

	}

	private static void gestionEleves() {
		System.out.println(
				"GESTION DES ELEVES! \nQuelles sont vos intentions? \nAjouter un(e) élève -> 1 \nModifier un élève -> 2 "
						+ "\nRetourner à la carte de gestion de l'école -> 3 \nMéfait accompli -> 4");
		switch (choix) {
		case 1:
			addEleve();
			break;
		case 2:
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

	public static void updateEleve() {
		System.out.println("Quelles sont vos intentions? \nChoisir une maison -> 1 \nChoisir une matière -> 2 "
				+ "\nAfficher les sorts -> 3 \nMéfait accompli -> 4");
		switch (choix) {
		case 1:
			;
			break;
		case 2:
			;
			break;
		case 3:
			;
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
		switch (choix) {
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

	private static void gestionMatieres() {
		System.out.println(
				"GESTION DES MATIERES! \nQuelles sont vos intentions? \nAjouter une matière -> 1 \nModifier une matière -> 2 "
						+ "\nRetourner à la carte de gestion de l'école -> 3 \nMéfait accompli -> 4");
		switch (choix) {
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
