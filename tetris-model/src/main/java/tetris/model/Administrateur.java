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
protected int admId;
	
	 @Column(name="ADM_MDP", columnDefinition="VARCHAR(50)")
	 @NotEmpty
	 @Size(max=50)
 protected String admMdp;
	 
 //Getters and Setters
	 public int getAdmId() {
			return admId;
		}

		public void setAdmId(int admId) {
			this.admId = admId;
		}

		public String getAdmMdp() {
			return admMdp;
		}

		public void setAdmMdp(String admMdp) {
			this.admMdp = admMdp;
		}

		
	//Constructeur	
		public Administrateur(int adm_id, String adm_mdp) {
			super();
			this.admId = adm_id;
			this.admMdp = adm_mdp;
		}

		

 

}
