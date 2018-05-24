package tetris.model;
@Entity
@Table(name="figure")
public class Figure {
protected int fig_idpiece;


	//Getters and Setters
public int getFig_idpiece() {
	return fig_idpiece;
}

public void setFig_idpiece(int fig_idpiece) {
	this.fig_idpiece = fig_idpiece;
}

public Figure(int fig_idpiece) {
	super();
	this.fig_idpiece = fig_idpiece;
}

}
