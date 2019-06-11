package dao;

import java.util.List;

import javax.persistence.*;

import application.Context;
import metier.Sorcier;

public class DaoSorcier implements DAO<Sorcier, Integer> {

	public void insert(Sorcier object) {
	
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(object);
		
		em.getTransaction().commit();
		
		em.close();
		Context.destroy();
	}
	

	public Sorcier selectById(Integer id) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		Sorcier s = em.find(Sorcier.class, id);
		em.close();
		Context.destroy();
		return s;
	}

	public void update(Sorcier object) {
		
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.merge(object);
		
		em.getTransaction().commit();
		
		em.close();
		
		Context.destroy();
		

	}

	public void delete(Sorcier object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.remove(object);
		
		em.getTransaction().commit();
		
		em.close();
		
		Context.destroy();
		
	}



	public List<Sorcier> selectAllWithGrade() {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createNamedQuery("Sorcier.findWithGrades", Sorcier.class);
		List<Sorcier> liste = query.getResultList();
		em.close();
		Context.destroy();
		return liste;
		
	}
	
	public List<Sorcier> selectAll(){
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		Query query=em.createQuery("from Sorcier");
		
		List<Sorcier> list = query.getResultList();
		em.close();
		Context.destroy();
		return list;
		
	}
		
//		public List<Sorcier> selectAllWithGun() {
//			EntityManagerFactory emf = Context.getInstance().getEmf();
//			EntityManager em = emf.createEntityManager();
//			
//			Query query = em.createNativeQuery(
//					"SELECT*FROM Sorcier, weapons where Sorcier.weapon_id(+)=weapon.id and weapon_type = 'gun' ", Sorcier.class);
//			List<Sorcier> liste = query.getResultList();
//			em.close();
//			Context.destroy();
//			return liste;
//			
//		}
//		public List<Sorcier> selectAllWithSword() {
//			EntityManagerFactory emf = Context.getInstance().getEmf();
//			EntityManager em = emf.createEntityManager();
//			
//			Query query = em.createNativeQuery(
//					"SELECT*FROM Sorcier, weapons where Sorcier.weapon_id(+)=weapon.id and weapon_type = 'sword' ", Sorcier.class);
//			List<Sorcier> liste = query.getResultList();
//			em.close();
//			Context.destroy();
//			return liste;
//			
//		}
}
