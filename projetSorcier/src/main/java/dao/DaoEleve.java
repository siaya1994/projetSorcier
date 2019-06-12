package dao;

import java.util.List;

import javax.persistence.*;

import application.Context;
import metier.*;


public class DaoEleve implements DAO<Eleve, Integer> {

	public void insert(Eleve object) {
	
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(object);
		
		em.getTransaction().commit();
		
		em.close();
		Context.destroy();
	}
	

	

	public Eleve selectById(Integer id) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		Eleve s = em.find(Eleve.class, id);
		em.close();
		Context.destroy();
		return s;
	}
	
	public  Eleve selectByName(String nom) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		Eleve s = em.find(Eleve.class, nom);
		em.close();
		Context.destroy();
		return s;
	}

	public void update(Eleve object) {
		
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.merge(object);
		
		em.getTransaction().commit();
		
		em.close();
		
		Context.destroy();
		

	}

	public void delete(Eleve object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.remove(object);
		
		em.getTransaction().commit();
		
		em.close();
		
		Context.destroy();
		
	}
	
	public List<Eleve> selectAll(){
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		Query query=em.createQuery("from Eleve");
		
		List<Eleve> list = query.getResultList();
		em.close();
		Context.destroy();
		return list;
		
	}
	
}
