package tetrisSpringJpa;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tetris.model.Piece;

public interface IDAOPiece extends JpaRepository<Piece, Integer> {
	
	public Piece findPieceById(int figIdPiece);

	
	//@Query("select p from Piece p join fetch p.figuresJouees f join fetch f.pointsJouees po where p.pieNom = :nomPiece")
	//public Piece findUnePiece(@Param("nomPiece")String PieceFigurePoint);



	
}
