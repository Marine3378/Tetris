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
	@Column(name="PER_ID")
	@NotNull
protected int pointId;
	@Column(name="POINT_X")
protected int pointX;
	@Column(name="POINT_Y")
protected int pointY;
	@ManyToOne
	@JoinColumn(name="pointIdFigure")
	protected Figure figure;
	
//protected int pointIdFigure;

//Getters and Setters
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
		public Point(int pointId, int pointX, int pointY, int pointIdFigure) {
			super();
			this.pointId = pointId;
			this.pointX = pointX;
			this.pointY = pointY;
			//this.pointIdFigure = pointIdFigure;
		}

		
}
