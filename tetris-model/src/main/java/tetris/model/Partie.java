package tetris.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Partie")
public class Partie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PAR_ID")
protected int parId;
	
	@Column(name="PAR_NIVEAU", columnDefinition="VARCHAR(50)")
protected String parNiveau; // peut-être à modifier en int
	
	@Column(name="PAR_SCORE")
protected int parScore;
	
	@ManyToOne
	@JoinColumn(name="PAR_IDJOUEUR")
	protected Joueur joueur;


	//Getters and setters
	public Joueur getJoueur() {
		return joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

	public int getParId() {
		return parId;
	}

	public void setParId(int parId) {
		this.parId = parId;
	}

	public String getParNiveau() {
		return parNiveau;
	}

	public void setParNiveau(String parNiveau) {
		this.parNiveau = parNiveau;
	}

	public int getParScore() {
		return parScore;
	}

	public void setParScore(int parScore) {
		this.parScore = parScore;
	}
	
		//Constructeur
		public Partie(/*int parId, String parNiveau, int parScore*/) {
		/*	super();
			this.parId = parId;
			this.parNiveau = parNiveau;
			this.parScore = parScore;
			*/
				
		}

	
		
}
