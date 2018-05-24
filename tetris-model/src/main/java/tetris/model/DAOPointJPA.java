package tetris.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class DAOPointJPA implements IDAOPoint{
	private EntityManager em;
	 public DAOPointJPA() {
		 this.em= HibernateUtils.getEntityManager();
	 }
	
	
	
	public Point save(Point entity) {
		EntityTransaction tx = em.getTransaction();
		try {
		tx.begin();
		this.em.persist(entity);
		tx.commit();
	
		return entity;
		}
		
		catch(Exception e){ return (entity);
		}
	}


	public boolean delete(Point entity) {
EntityTransaction tx=this.em.getTransaction();
		
		try {
		tx.begin();	
		this.em.remove(this.em.merge(entity));
		tx.commit();
		 return true;
		 
		}
		catch (Exception ex){
			return false;
	}
		}

	public Point findById(int id) {
		return this.em.find(Point.class, id);
	}

	public List<Point> findAll() {
		return this.em
				.createQuery("select p from Point p", Point.class)
				.getResultList();
		}

	}
	
