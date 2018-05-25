package tetris.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name= "point")
public class Point {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="POINT_ID")
	@NotNull
protected int pointId;
	@Column(name="POINT_X")
protected int pointX;
	@Column(name="POINT_Y")
protected int pointY;
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
	public int getPointId() {
		return pointId;
	}

	public void setPointId(int pointId) {
		this.pointId = pointId;
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
