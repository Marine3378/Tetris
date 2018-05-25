package tetris.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class DAOFigureJPA implements IDAOFigure{
	private EntityManager em;
	 public DAOFigureJPA() {
		 this.em= HibernateUtils.getEntityManager();
	 }
	
	
	
	public Figure save(Figure entity) {
		EntityTransaction tx = em.getTransaction();
		try {
		tx.begin();
		this.em.persist(entity);
		tx.commit();
	
		return entity;
		}
		
		catch(Exception ex){ 
			ex.printStackTrace();
			return (entity);
		
		}
	}


	public boolean delete(Figure entity) {
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

	public Figure findById(int id) {
		return this.em.find(Figure.class, id);
	}

	public List<Figure> findAll() {
		return this.em
				.createQuery("select f from Figure f", Figure.class)
				.getResultList();
		}

	}
	
