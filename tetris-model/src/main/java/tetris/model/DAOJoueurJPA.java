package tetris.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import tetris.model.HibernateUtils;

public class DAOJoueurJPA implements IDAOJoueur{

	private EntityManager em;
	
	public DAOJoueurJPA() {
		this.em= HibernateUtils.getEntityManager();
	}
	
	public Joueur save(Joueur o) {
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

	public boolean delete(Joueur o) {
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

	public List<Joueur> findAll() {
		return this.em.createQuery("select j from Joueur j", Joueur.class).setHint("org.hibernate.cacheable", true).getResultList();
		}


	public Joueur findById(int id) {
		return this.em.find(Joueur.class, id);
	}

	

}
