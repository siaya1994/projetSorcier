package dao;

import java.util.List;

import javax.persistence.*;

import application.Context;
import metier.Maison;
import metier.Matiere;

public class DaoMaison implements DAO<Maison, Integer> {

	public void insert(Maison object) {
	
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(object);
		
		em.getTransaction().commit();
		
		em.close();
		Context.destroy();
	}
	
	public Maison selectById(Integer id) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		Maison s = em.find(Maison.class, id);
		em.close();
		Context.destroy();
		return s;
	}
	
	public  Maison selectByName(String nom) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		Maison s = em.find(Maison.class, nom);
		em.close();
		Context.destroy();
		return s;
	}

	public void update(Maison object) {
		
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.merge(object);
		
		em.getTransaction().commit();
		
		em.close();
		
		Context.destroy();
		

	}

	public void delete(Maison object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.remove(object);
		
		em.getTransaction().commit();
		
		em.close();
		
		Context.destroy();
		
	}



	public List<Maison> selectAllWithGrade() {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createNamedQuery("Maison.findWithGrades", Maison.class);
		List<Maison> liste = query.getResultList();
		em.close();
		Context.destroy();
		return liste;
		
	}
	
	public List<Maison> selectAll(){
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		Query query=em.createQuery("from Maison");
		
		List<Maison> list = query.getResultList();
		em.close();
		Context.destroy();
		return list;
		
	}
		
//		public List<Maison> selectAllWithGun() {
//			EntityManagerFactory emf = Context.getInstance().getEmf();
//			EntityManager em = emf.createEntityManager();
//			
//			Query query = em.createNativeQuery(
//					"SELECT*FROM Maison, weapons where Maison.weapon_id(+)=weapon.id and weapon_type = 'gun' ", Maison.class);
//			List<Maison> liste = query.getResultList();
//			em.close();
//			Context.destroy();
//			return liste;
//			
//		}
//		public List<Maison> selectAllWithSword() {
//			EntityManagerFactory emf = Context.getInstance().getEmf();
//			EntityManager em = emf.createEntityManager();
//			
//			Query query = em.createNativeQuery(
//					"SELECT*FROM Maison, weapons where Maison.weapon_id(+)=weapon.id and weapon_type = 'sword' ", Maison.class);
//			List<Maison> liste = query.getResultList();
//			em.close();
//			Context.destroy();
//			return liste;
//			
//		}
}
