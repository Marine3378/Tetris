

public class Point {
protected int point_id;
protected int point_x;
protected int point_y;
protected int point_idfigure;

//Getters and Setters
		public int getPoint_id() {
			return point_id;
		}
		public void setPoint_id(int point_id) {
			this.point_id = point_id;
		}
		public int getPoint_x() {
			return point_x;
		}
		public void setPoint_x(int point_x) {
			this.point_x = point_x;
		}
		public int getPoint_y() {
			return point_y;
		}
		public void setPoint_y(int point_y) {
			this.point_y = point_y;
		}
		
		public int getPoint_idfigure() {
			return point_idfigure;
		}
		public void setPoint_idfigure(int point_idfigure) {
			this.point_idfigure = point_idfigure;
		}
		//Constructeur
		public Point(int point_id, int point_x, int point_y, int point_idfigure) {
			super();
			this.point_id = point_id;
			this.point_x = point_x;
			this.point_y = point_y;
			this.point_idfigure = point_idfigure;
		}
}
