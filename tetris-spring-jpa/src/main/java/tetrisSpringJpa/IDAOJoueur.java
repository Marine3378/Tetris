package tetrisSpringJpa;

import org.springframework.data.jpa.repository.JpaRepository;

import tetris.model.Joueur;

public interface IDAOJoueur extends JpaRepository<Joueur, Integer> {

}
