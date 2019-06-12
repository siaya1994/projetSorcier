package test;


import dao.*;
import metier.*;



public class TestLeo {

	public static void main(String[] args) {
	testSorcier();

	}
	
	public static void testSorcier(){
		DaoEleve daoE = new DaoEleve();
		DaoProfesseur daoP = new DaoProfesseur();
		DaoMaison daoM = new DaoMaison();
		DaoMatiere daoMat = new DaoMatiere();
		Professeur p = new Professeur();
		p.setNom("Dumbledore");
		p.setPrenom("Albus");
		Matiere m = new Matiere("potion");
		p.setMatiere(m);
		
		Eleve e = new Eleve("Potter","Harry",18,Civilite.M,Patronus.cerf);
		Eleve e2 = new Eleve("Potter2","Harry2",18,Civilite.M,Patronus.cerf);
		Maison maison = new Maison("Gryffondor");
		Maison maison2 = new Maison("Serpentard");
		
		
		
		daoMat.insert(m);
		daoP.insert(p);
		daoM.insert(maison);
		daoM.insert(maison2);
		e.setMaison(maison);
		e2.setMaison(maison2);
		daoE.insert(e);
		daoE.insert(e2);
		
		
		
		
				
		System.out.println(e);
		System.out.println(maison);
		System.out.println(p);
		
	
		
		
	}

}
