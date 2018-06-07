package tetrisSpringJpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tetris.model.Figure;
import tetris.model.Point;

public interface IDAOPoint extends JpaRepository<Point, Integer> {

	public Point findPointById(int pointId);
	
	public  List<Point> findAllPointByFigure(Figure figure);
}
