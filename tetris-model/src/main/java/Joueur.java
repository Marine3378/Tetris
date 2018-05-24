

public class Joueur {
protected int jou_id;
protected String jou_nom;
protected String jou_prenom;
protected String jou_nomutilisateur;

//Getters and Setters
			public int getJou_id() {
				return jou_id;
			}
			public void setJou_id(int jou_id) {
				this.jou_id = jou_id;
			}
			public String getJou_nom() {
				return jou_nom;
			}
			public void setJou_nom(String jou_nom) {
				this.jou_nom = jou_nom;
			}
			public String getJou_prenom() {
				return jou_prenom;
			}
			public void setJou_prenom(String jou_prenom) {
				this.jou_prenom = jou_prenom;
			}
			public String getJou_nomutilisateur() {
				return jou_nomutilisateur;
			}
			public void setJou_nomutilisateur(String jou_nomutilisateur) {
				this.jou_nomutilisateur = jou_nomutilisateur;
			}
// Constructeur
//oblige le joueur à entrer toutes ces informations pour se créer
		public Joueur(/*int jou_id,*/ String jou_nom/*, String jou_prenom, String jou_nomutilisateur*/) {
			super();
			this.jou_id = jou_id;
			this.jou_nom = jou_nom;
			this.jou_prenom = jou_prenom;
			this.jou_nomutilisateur = jou_nomutilisateur;
		}
}
