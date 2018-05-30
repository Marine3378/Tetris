package tetrisSpringJpa;

import org.springframework.data.jpa.repository.JpaRepository;

import tetris.model.Point;

public interface IDAOPoint extends JpaRepository<Point, Integer> {

	public Point findPointById(int pointId);
}
