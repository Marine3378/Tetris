package tetrisSpringJpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tetris.model.Piece;

public interface IDAOPiece extends JpaRepository<Piece, Integer> {
	
	@Query("select p from Piece p join fetch p.Figure f join fetch f.Point po where p.nom = :nomPiece")
	public Piece findUnePiece(@Param("nomPiece")String PieceFigurePoint);
	
	
	
	
	/*public List<Piece> findPiece(String nomPiece)
	{
		Query myQuery = em.createQuery("select p from Piece p join fetch p.Figure f join fetch f.Point po where p.nom = :nomPiece", Piece.class);
		myQuery.setParameter("nomPiece", nomPiece);
		em.close();
		return myQuery.getResultList();
	}*/
}
