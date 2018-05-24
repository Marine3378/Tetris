package tetris.model;

import java.util.List;

import javax.persistence.EntityManager;

import tetris.model.HibernateUtils;

public class DAOPartieJPA implements IDAOPartie {

	private EntityManager em;
	
	public DAOPartieJPA() {
		this.em= HibernateUtils.getEntityManager();
	}
	
	@Override
	public Partie save(Partie o) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete(Partie o) {
		// TODO Auto-generated method stub
		return false;
	}

	public Partie find(Partie o) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Partie> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
