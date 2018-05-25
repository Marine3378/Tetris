package tetris.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;



public class DAOAdministrateurJPA implements IDAOAdministrateur{
	private EntityManager em;
	 public DAOAdministrateurJPA() {
		 this.em= HibernateUtils.getEntityManager();
	 }
	
	
	
	public Administrateur save(Administrateur entity) {
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


	public boolean delete(Administrateur entity) {
EntityTransaction tx=this.em.getTransaction();
		
		try {
		tx.begin();	
		this.em.remove(this.em.merge(entity));
		tx.commit();
		 return true;
		 
		}
		catch (Exception ex){
			ex.printStackTrace();
			return false;
	}
		}

	public Administrateur findById(int id) {
		return this.em.find(Administrateur.class, id);
	}

	public List<Administrateur> findAll() {
		return this.em
				.createQuery("select a from Administrateur a", Administrateur.class)
				.getResultList();
		}

	}
	
