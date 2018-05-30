package tetrisSpringJpa;

import org.springframework.data.jpa.repository.JpaRepository;

import tetris.model.Administrateur;

public interface IDAOAdministrateur extends JpaRepository<Administrateur, Integer> {
	
	
	
	
		/*@Query("select p from Produit p where p.libelle = :libelle")
		public Produit findAvecLibelle(@Param("libelle") String libelle);
		
		public List<Produit> findByPrixBetween(Double a, Double b);
		
		@Transactional
		public void deleteByLibelleStartsWithIgnoreCase(String libelle);
	}*/
}
