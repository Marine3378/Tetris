package tetrisSpringJpa;

import org.springframework.data.jpa.repository.JpaRepository;

import tetris.model.Figure;

public interface IDAOFigure extends JpaRepository<Figure, Integer> {

}
