

public class Piece {
 protected int pie_id;
 protected String pie_nom;
 protected String pie_couleur;
 protected int pie_idpoint;
 
 
		// Getters and Setters
					public int getPie_id() {
						return pie_id;
					}
					public void setPie_id(int pie_id) {
						this.pie_id = pie_id;
					}
					public String getPie_nom() {
						return pie_nom;
					}
					
					public void setPie_nom(String pie_nom) {
						this.pie_nom = pie_nom;
					}
					public String getPie_couleur() {
						return pie_couleur;
					}
					public void setPie_couleur(String pie_couleur) {
						this.pie_couleur = pie_couleur;
					}
					public int getPie_idpoint() {
						return pie_idpoint;
					}
					public void setPie_idpoint(int pie_idpoint) {
						this.pie_idpoint = pie_idpoint;
					}
	//Constructeurs
			public Piece(int pie_id, String pie_nom, String pie_couleur) {
				super();
				this.pie_id = pie_id;
				this.pie_nom = pie_nom;
				this.pie_couleur = pie_couleur;
				
			}
}
