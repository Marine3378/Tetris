package tetris.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Piece {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PIE_ID")
	@NotNull
 protected int pieId;
	@Column(name="PIE_NOM", columnDefinition="VARCHAR(50)")
 protected String pieNom;
	@Column(name="PIE_COU", columnDefinition="VARCHAR(50)")
 protected String pieCouleur;
	@Column(name="PIE_IDPOINT")
 protected int pieIdPoint;
 
 
		// Getters and Setters
	public int getPieId() {
		return pieId;
	}


	public void setPieId(int pieId) {
		this.pieId = pieId;
	}


	public String getPieNom() {
		return pieNom;
	}


	public void setPieNom(String pieNom) {
		this.pieNom = pieNom;
	}


	public String getPieCouleur() {
		return pieCouleur;
	}


	public void setPieCouleur(String pieCouleur) {
		this.pieCouleur = pieCouleur;
	}


	public int getPieIdPoint() {
		return pieIdPoint;
	}


	public void setPieIdPoint(int pieIdPoint) {
		this.pieIdPoint = pieIdPoint;
	}		
					
	//Constructeurs
			public Piece(int pieId, String pieNom, String pieCouleur) {
				super();
				this.pieId = pieId;
				this.pieNom = pieNom;
				this.pieCouleur = pieCouleur;
				
			}


		
}
