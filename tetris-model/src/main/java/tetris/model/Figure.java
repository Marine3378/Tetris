package tetris.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="figure")
public class Figure {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name= "FIG_ID")
	protected int figId;
	
	@ManyToOne
	@JoinColumn(name="FIG_IDPIECE")
	protected Piece piece;
	
	

public Piece getPiece() {
		return piece;
	}


	public void setPiece(Piece piece) {
		this.piece = piece;
	}

@OneToMany (mappedBy="figure")
private List<Point> pointsJouees;

	//Getters and Setters

	public List<Point> getPointsJouees() {
	return pointsJouees;
	}
	
	
	public void setPointsJouees(List<Point> pointsJouees) {
	this.pointsJouees = pointsJouees;
	}

	public int getFigId() {
		return figId;
	}

	
	public void setFigId(int figId) {
		this.figId = figId;
	}

		//Constructeur
/*public Figure(int figIdpiece) {
	super();
	this.figIdpiece = figIdpiece;
}*/

public Figure() {
	
}



}
