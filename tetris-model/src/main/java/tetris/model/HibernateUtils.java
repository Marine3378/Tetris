package tetris.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtils {
	private static EntityManagerFactory emf;
	private static List<EntityManager> entityManager = new ArrayList();
	public static void open() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("NomPersistenceUnit");
		}
	}
	public static void close() {
		for (EntityManager em : entityManager) {
			em.close();
		}
		emf.close();
	}
	
	public static EntityManager getEntityManager()
	{
		if (emf == null) {
			open();
		}
		EntityManager em= emf.createEntityManager();
		entityManager.add(em);
		return em;
	}
}
