package tetris.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
 @Table(name="administrateur")

public class Administrateur {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="ADM_ID")
	 protected int id;
	 
	 @Column(name="ADM_NOMUTILISATEUR", columnDefinition="VARCHAR(50)")
	 @NotEmpty(message = "Le nom d'utilisateur est obligatoire")
	 @Size(max=50)
	protected String nomUtilisateur;
	
	 @Column(name="ADM_MDP", columnDefinition="VARCHAR(50)")
	 @NotEmpty(message = "Le mot de passe est obligatoire")
	 @Size(max=50)
	 protected String admMdp;
	 
 public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	//Getters and Setters
	 public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getAdmMdp() {
			return admMdp;
		}

		public void setAdmMdp(String admMdp) {
			this.admMdp = admMdp;
		}

		
	//Constructeur	
		//vide pour instancier methode delete:
		public Administrateur() {
			
		}
		public Administrateur(String admMdp /*adm_id, */) {
			super();
			//.admId = adm_id;
			this.admMdp = admMdp;
		}
		

 

}
