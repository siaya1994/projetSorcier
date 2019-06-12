package test;

import dao.DaoEleve;
import dao.DaoMaison;
import dao.DaoMatiere;
import dao.DaoProfesseur;
import dao.DaoSort;
import metier.Eleve;
import metier.Maison;
import metier.Matiere;
import metier.Professeur;
import metier.Sort;
import metier.Type_sort;

public class TestSiham {

	public static void main(String[] args) {

		testMaison();
		//testSorcier();

	}

	public static void test() {

		DaoMatiere daoMatiere = new DaoMatiere();
		Matiere m1 = new Matiere("Divination");

		DaoSort daoSort = new DaoSort();
		Sort s1 = new Sort("Silencio", Type_sort.sortilege);

		DaoProfesseur daoProf = new DaoProfesseur();
		Professeur p1 = new Professeur();

		p1.setNom("Trelawney");
		p1.setPrenom("Sibylle");
		p1.setAge(40);
		daoProf.insert(p1);

		daoSort.insert(s1);
		m1.addSort(s1);
		m1.setProfesseur("Trelawney");

		daoMatiere.insert(m1);
		s1.setMatiere(m1);

		System.out.println(m1);
		System.out.println(p1);
	}

	public static void testMaison() {

		DaoMaison daoMaison = new DaoMaison();
		Maison maison1 = new Maison("Gryffondor");
		Maison maison2 = new Maison("Serpentard");
		Maison maison3 = new Maison("Serdaigle");
		Maison maison4 = new Maison("Poufsouffle");

		maison1.setScore(300);
		maison2.setScore(285);
		maison3.setScore(215);
		maison4.setScore(275);

		DaoProfesseur daoProf = new DaoProfesseur();
		Professeur p1 = new Professeur();
		Professeur p2 = new Professeur();
		Professeur p3 = new Professeur();
		Professeur p4 = new Professeur();

		p1.setPrenom("Minerva");
		p1.setNom("McGonagal");
		p1.setAge(60);
		
		
		p2.setPrenom("Severus");
		p2.setNom("Rogue");
		p2.setAge(55);

		p3.setPrenom("Filius");
		p3.setNom("Flitwick");
		p3.setAge(68);

		p4.setPrenom("Pomona");
		p4.setNom("Chourave");
		p4.setAge(55);

		daoProf.insert(p1);
		daoProf.insert(p2);
		daoProf.insert(p3);
		daoProf.insert(p4);

		maison1.setProfesseur(p1);
		maison2.setProfesseur(p2);
		maison3.setProfesseur(p3);
		maison4.setProfesseur(p4);

		daoMaison.insert(maison1);
		daoMaison.insert(maison2);
		daoMaison.insert(maison3);
		daoMaison.insert(maison4);

	}
	
	public static void testSorcier(){
		
		DaoMaison daoMaison = new DaoMaison();
		Maison maison1 = new Maison("Gryffondor");
		Maison maison2 = new Maison("Serpentard");
		
		DaoEleve daoE = new DaoEleve();
		Eleve e1 = new Eleve();
		Eleve e2 = new Eleve();
		
		e1.setPrenom("Harry");
		e1.setNom("Potter");
		e1.setAge(20);
		e1.setMaison(maison1);
		
		e1.setPrenom("Drago");
		e1.setNom("Malfoy");
		e1.setAge(21);
		e1.setMaison(maison2);
		
		
		
		DaoProfesseur daoProf = new DaoProfesseur();
		Professeur p5 = new Professeur();
		Professeur p6 = new Professeur();
		
	}

}
