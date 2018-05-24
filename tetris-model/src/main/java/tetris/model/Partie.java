package tetris.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Partie")
public class Partie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PER_ID")
	@NotNull
protected int parId;
	
	@Column(name="PAR_NIVEAU", columnDefinition="VARCHAR(50)")
protected String parNiveau; // peut-�tre � modifier en int
	
	@Column(name="PAR_SCORE")
protected int parScore;
	@Column(name="PAR_IDJOUEUR")
protected int parIdJoueur;

//Getters and setters
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

	public int getParIdJoueur() {
		return parIdJoueur;
	}

	public void setParIdJoueur(int parIdJoueur) {
		this.parIdJoueur = parIdJoueur;
	}
	
		//Constructeur
		public Partie(int parId/*, String parNiveau, int parScore*/) {
			super();
			this.parId = parId;
			this.parNiveau = parNiveau;
			this.parScore = parScore;
			System.out.println("partie");
		}

	
		
}