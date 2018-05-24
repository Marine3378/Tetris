package tetris.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="figure")
public class Figure {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FIG_IDPIECE")
protected int figIdpiece;


	//Getters and Setters
	public int getFigIdpiece() {
		return figIdpiece;
	}


	public void setFigIdpiece(int figIdpiece) {
		this.figIdpiece = figIdpiece;
	}

public Figure(int fig_idpiece) {
	super();
	this.figIdpiece = fig_idpiece;
}




}
