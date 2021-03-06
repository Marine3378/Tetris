
package tetris.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import tetris.model.HibernateUtils;

public class DAOPieceJPA implements IDAOPiece{

	private EntityManager em;
	
	public DAOPieceJPA() {
		this.em= HibernateUtils.getEntityManager();
	}
	
	public Piece save(Piece o) {
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

	public boolean delete(Piece o) {
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

	public List<Piece> findAll() {
		return this.em.createQuery("select p from Piece p", Piece.class).setHint("org.hibernate.cacheable", true).getResultList();
		}


	public Piece findById(int id) {
		return this.em.find(Piece.class, id);
	}

	
	public List<Piece> findPiece(String nomPiece)
	{
		Query myQuery = em.createQuery("select p from Piece p join fetch p.Figure f join fetch f.Point po where p.nom = :nomPiece", Piece.class);
		myQuery.setParameter("nomPiece", nomPiece);
		em.close();
		return myQuery.getResultList();
	}

	
}
