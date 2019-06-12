package dao;

import java.util.List;

import javax.persistence.*;

import application.Context;
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



	public List<Sort> selectAllWithGrade() {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createNamedQuery("Sort.findWithGrades", Sort.class);
		List<Sort> liste = query.getResultList();
		em.close();
		Context.destroy();
		return liste;
		
	}
	
	public List<Sort> selectAll(){
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		Query query=em.createQuery("from Sort");
		
		List<Sort> list = query.getResultList();
		em.close();
		Context.destroy();
		return list;
		
	}
		
//		public List<Sort> selectAllWithGun() {
//			EntityManagerFactory emf = Context.getInstance().getEmf();
//			EntityManager em = emf.createEntityManager();
//			
//			Query query = em.createNativeQuery(
//					"SELECT*FROM Sort, weapons where Sort.weapon_id(+)=weapon.id and weapon_type = 'gun' ", Sort.class);
//			List<Sort> liste = query.getResultList();
//			em.close();
//			Context.destroy();
//			return liste;
//			
//		}
//		public List<Sort> selectAllWithSword() {
//			EntityManagerFactory emf = Context.getInstance().getEmf();
//			EntityManager em = emf.createEntityManager();
//			
//			Query query = em.createNativeQuery(
//					"SELECT*FROM Sort, weapons where Sort.weapon_id(+)=weapon.id and weapon_type = 'sword' ", Sort.class);
//			List<Sort> liste = query.getResultList();
//			em.close();
//			Context.destroy();
//			return liste;
//			
//		}
}