package tetris.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="figure")
public class Figure {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name= "FIG_ID")
	protected int id;
	
	@ManyToOne
	@JoinColumn(name="FIG_IDPIECE")
	@NotNull (message = "L'id de la piece correspondante est obligatoire")
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

	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

		//Constructeur
/*public Figure(int figIdpiece) {
	super();
	this.figIdpiece = figIdpiece;
}*/

public Figure() {
	
}



}
