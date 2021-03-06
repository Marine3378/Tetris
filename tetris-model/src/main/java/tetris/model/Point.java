package tetris.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name= "point")
public class Point {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="POINT_ID")
	@NotNull
protected int id;
	
	@Column(name="POINT_X")
	@NotNull(message = "X doit �tre d�fini")
	
protected int pointX;
	@Column(name="POINT_Y")
	@NotNull(message = "Y doit �tre d�fini")
protected int pointY;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="POINT_IDFIGURE")
	protected Figure figure;
	
//protected int pointIdFigure;



	//Getters and Setters
	public Figure getFigure() {
		return figure;
	}

	public void setFigure(Figure figure) {
		this.figure = figure;
	}
	public int getId() {
		return id;
	}

	public void setId(int pointId) {
		this.id = id;
	}

	public int getPointX() {
		return pointX;
	}

	public void setPointX(int pointX) {
		this.pointX = pointX;
	}

	public int getPointY() {
		return pointY;
	}

	public void setPointY(int pointY) {
		this.pointY = pointY;
	}

	/*public int getPointIdFigure() {
		return pointIdFigure;
	}

	public void setPointIdFigure(int pointIdFigure) {
		this.pointIdFigure = pointIdFigure;
	}*/
		//Constructeur
		public Point(/*int pointId, int pointIdFigure,*/ int pointX, int pointY) {
			super();
			this.pointX = pointX;
			this.pointY = pointY;
			//this.pointIdFigure = pointIdFigure;
		}

		public Point() {
			
		}
}
