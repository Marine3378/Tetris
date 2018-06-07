package tetrisSpringJpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tetris.model.Figure;
import tetris.model.Piece;

public interface IDAOFigure extends JpaRepository<Figure, Integer> {

	public Figure findFigureById(int figureId);
	
	public List<Figure> findAllFigureByPiece(Piece piece);

}
