package dao;

import java.util.List;

import javax.persistence.*;

import application.Context;
import metier.Sort;
import metier.Sort;

public class DaoSort implements DAO<Sort, Integer> {

	public void insert(Sort object) {

		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(object);

		em.getTransaction().commit();

		em.close();
		Context.destroy();
	}

	public Sort selectById(Integer id) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Sort s = em.find(Sort.class, id);
		em.close();
		Context.destroy();
		return s;
	}

	public void update(Sort object) {

		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.merge(object);

		em.getTransaction().commit();

		em.close();

		Context.destroy();

	}

	public void delete(Sort object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.remove(object);

		em.getTransaction().commit();

		em.close();

		Context.destroy();

	}

	public List<Sort> selectAll() {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("from Sort");

		List<Sort> list = query.getResultList();
		em.close();
		Context.destroy();
		return list;

	}

	public Sort selectByName(String nom) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Sort m = em.find(Sort.class, nom);
		em.close();
		Context.destroy();
		return m;
	}

}
