package tetris.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="piece")
public class Piece {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PIE_ID")
	@NotNull
 protected int pieId;
	@Column(name="PIE_NOM", columnDefinition="VARCHAR(50)")
 protected String pieNom;
	@Column(name="PIE_COULEUR", columnDefinition="VARCHAR(50)")
 protected String pieCouleur;

 
	@OneToMany(mappedBy="piece")
	private List<Figure> figuresJouees;
 
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


		
				
	public List<Figure> getFiguresJouees() {
		return figuresJouees;
	}


	public void setFiguresJouees(List<Figure> figuresJouees) {
		this.figuresJouees = figuresJouees;
	}


			//Constructeurs
			public Piece() {
				
				
			}
			public Piece(/*int pieId,*/String pieNom, String pieCouleur) {
				super();
				//this.pieId = pieId;
				this.pieNom = pieNom;
				this.pieCouleur = pieCouleur;
				
			}

		
}
