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
	@Column (name= "FIG_IDPIECE")
	protected int figIdpiece;
	
	@ManyToOne
	@JoinColumn(name="FIG_PIECE")
	protected Piece piece;
	
	

@OneToMany (mappedBy="figure")
private List<Point> pointsJouees;

	//Getters and Setters

	public List<Point> getPointsJouees() {
	return pointsJouees;
	}
	
	
	public void setPointsJouees(List<Point> pointsJouees) {
	this.pointsJouees = pointsJouees;
	}

	public int getFigIdpiece() {
		return figIdpiece;
	}

	
	public void setFigIdpiece(int figIdpiece) {
		this.figIdpiece = figIdpiece;
	}

		//Constructeur
public Figure(int fig_idpiece) {
	super();
	this.figIdpiece = fig_idpiece;
}




}
