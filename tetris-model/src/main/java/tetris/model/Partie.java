package tetris.model;

public class Partie {
protected int par_id;
protected String par_niveau; // peut-être à modifier en int
protected int par_score;
protected int par_idjoueur;

//Getters and setters
		public int getPar_id() {
			return par_id;
		}
		public void setPar_id(int par_id) {
			this.par_id = par_id;
		}
		public String getPar_niveau() {
			return par_niveau;
		}
		public void setPar_niveau(String par_niveau) {
			this.par_niveau = par_niveau;
		}
		public int getPar_score() {
			return par_score;
		}
		public void setPar_score(int par_score) {
			this.par_score = par_score;
		}
		public int getPar_idjoueur() {
			return par_idjoueur;
		}
		public void setPar_idjoueur(int par_idjoueur) {
			this.par_idjoueur = par_idjoueur;
		}
		//Constructeur
		public Partie(int par_id/*, String par_niveau, int par_score*/) {
			super();
			this.par_id = par_id;
			this.par_niveau = par_niveau;
			this.par_score = par_score;
			System.out.println("partie");
		}
		
		
}
