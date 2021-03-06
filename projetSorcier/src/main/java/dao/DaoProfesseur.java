package dao;

import java.util.List;

import javax.persistence.*;

import application.Context;
import metier.Professeur;
import metier.Professeur;

public class DaoProfesseur implements DAO<Professeur, Integer> {

	public void insert(Professeur object) {
	
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(object);
		
		em.getTransaction().commit();
		
		em.close();
		Context.destroy();
	}
	

	public Professeur selectById(Integer id) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		Professeur s = em.find(Professeur.class, id);
		em.close();
		Context.destroy();
		return s;
	}
	
	public  Professeur selectByName(String nom) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		Professeur s = em.find(Professeur.class, nom);
		em.close();
		Context.destroy();
		return s;
	}

	public void update(Professeur object) {
		
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.merge(object);
		
		em.getTransaction().commit();
		
		em.close();
		
		Context.destroy();
		

	}

	public void delete(Professeur object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.remove(object);
		
		em.getTransaction().commit();
		
		em.close();
		
		Context.destroy();
		
	}
	
	public List<Professeur> selectAll(){
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		Query query=em.createQuery("from Professeur");
		
		List<Professeur> list = query.getResultList();
		em.close();
		Context.destroy();
		return list;
		
	}
}
