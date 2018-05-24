package tetris.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import tetris.model.HibernateUtils;

public class DAOPartieJPA implements IDAOPartie {

	private EntityManager em;
	
	public DAOPartieJPA() {
		this.em= HibernateUtils.getEntityManager();
	}
	
	
	public Partie save(Partie o) {
		EntityTransaction tx = em.getTransaction(); 
		try {
		tx.begin();
		this.em.persist(o);
		tx.commit();
		return o;
				}
		catch (Exception e) {
			return o;
		}
	}

	public boolean delete(Partie o) {
		EntityTransaction tx = em.getTransaction(); 
		try {
			tx.begin();
			this.em.remove(this.em.merge(o));
			tx.commit();
			return true;
				}
		catch (Exception ex) {
			tx.rollback();
			return false;
		}
	}

	public Partie findById(int id) {
		return this.em.find(Partie.class, id);
	}

	public List<Partie> findAll() {
		return this.em.createQuery("select p from Partie p", Partie.class).setHint("org.hibernate.cacheable", true).getResultList();
	}





}
