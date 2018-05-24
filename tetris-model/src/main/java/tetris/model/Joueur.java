package tetris.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="joueur")
public class Joueur {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="JOU_ID")
protected int jouId;
	
	@Column(name="JOU_NOM", columnDefinition="VARCHAR(50)")
	@NotEmpty
	@Size(max=50)
protected String jouNom;
	
	@Column(name="JOU_PRENOM", columnDefinition="VARCHAR(50)")
	@NotEmpty
	@Size(max=50)

protected String jouPrenom;
	
	@Column(name="JOU_NOMUTILISATEUR", columnDefinition="VARCHAR(50)")
	@NotEmpty
	@Size(max=50)
protected String jouNomutilisateur;
	
	@OneToMany(mappedBy="JOUEUR")
	private List<Partie> partiesJouees;
	
	
//Getters and Setters
	public int getJouId() {
		return jouId;
	}

	public void setJouId(int jouId) {
		this.jouId = jouId;
	}

	public String getJouNom() {
		return jouNom;
	}

	public void setJouNom(String jouNom) {
		this.jouNom = jouNom;
	}

	public String getJouPrenom() {
		return jouPrenom;
	}

	public void setJouPrenom(String jouPrenom) {
		this.jouPrenom = jouPrenom;
	}

	public String getJouNomutilisateur() {
		return jouNomutilisateur;
	}

	public void setJouNomutilisateur(String jouNomutilisateur) {
		this.jouNomutilisateur = jouNomutilisateur;
	}
	

public List<Partie> getPartiesJouees() {
		return partiesJouees;
	}

	public void setPartiesJouees(List<Partie> partiesJouees) {
		this.partiesJouees = partiesJouees;
	}

		// Constructeur
//oblige le joueur à entrer toutes ces informations pour se créer
		public Joueur(/*int jouId,*/ String jouNom/*, String jouPrenom, String jouNomutilisateur*/) {
			super();
			this.jouId = jouId;
			this.jouNom = jouNom;
			this.jouPrenom = jouPrenom;
			this.jouNomutilisateur = jouNomutilisateur;
		}

		
}
