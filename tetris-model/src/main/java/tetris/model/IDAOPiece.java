package tetris.model;

import java.util.List;

public interface IDAOPiece extends IDAO<Piece>{
		 public List<Piece> findPiece(String nomPiece);
}
