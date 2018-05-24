

public class Administrateur {
 protected int adm_id;
 protected String adm_mdp;
 
 //Getters and Setters
		public int getAdm_id() {
			return adm_id;
		}
		public void setAdm_id(int adm_id) {
			this.adm_id = adm_id;
		}
		public String getAdm_mdp() {
			return adm_mdp;
		}
		public void setAdm_mdp(String adm_mdp) {
			this.adm_mdp = adm_mdp;
		}
		
	//Constructeur	
		public Administrateur(int adm_id, String adm_mdp) {
			super();
			this.adm_id = adm_id;
			this.adm_mdp = adm_mdp;
		}

 

}
