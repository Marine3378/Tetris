package tetris.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
 protected int id;
	@Column(name="PIE_NOM", columnDefinition="VARCHAR(50)")
 protected String pieNom;
	@Column(name="PIE_COULEUR", columnDefinition="VARCHAR(50)")
 protected String pieCouleur;

 
	@OneToMany(mappedBy="piece")
	private Set<Figure> figuresJouees;
 
		// Getters and Setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


		
			
	public Set<Figure> getFiguresJouees() {
		return figuresJouees;
	}


	public void setFiguresJouees(Set<Figure> figuresJouees) {
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
