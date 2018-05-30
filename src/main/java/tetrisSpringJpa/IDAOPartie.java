package tetrisSpringJpa;

import org.springframework.data.jpa.repository.JpaRepository;

import tetris.model.Partie;

public interface IDAOPartie extends JpaRepository<Partie, Integer> {

}
