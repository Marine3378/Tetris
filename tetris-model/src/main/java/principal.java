


public class principal {

	public static void main(String[] args) {
			
/*Scanner sc = new Scanner(System.in);
		
	DAOJoueur daoJoueur = new DAOJoueur();
	DAOPartie daoPartie = new DAOPartie();
	DAOAdministrateur daoAdmin = new DAOAdministrateur();
	DAOFigure daoFigure = new DAOFigure();
	DAOPiece daoPiece = new DAOPiece();
	DAOPoint daoPoint = new DAOPoint();
	
	try {
		Class.forName("com.mysql.jdc.Driver");
	}
	catch(Exception e) {}*/
	
	//CREATION avec Findall()
	
/*	System.out.println("Voulez vous /n 1-ajouter un joueur /n modifier un joueur ?");
	int choix= sc.nextInt();
	switch (choix) {
		case 1 :
			System.out.println("jou_id");
			int jou_id=sc.nextInt();
			System.out.println("jou_nom");
			String jou_nom=sc.next();
			System.out.println("jou_prenom");
			String jou_prenom=sc.next();
			System.out.println("jou_nomutilisateur");
			String jou_nomutilisateur=sc.next();
			Joueur joueur = new Joueur(jou_nom);
			joueur.setJou_id(jou_id);
			joueur.setJou_prenom(jou_prenom);
			joueur.setJou_nomutilisateur(jou_nomutilisateur);
			daoJoueur.save(joueur,choix);
			break;
			case 2 :
				System.out.println("Saisissez le nom du joueur à modifier");
				jou_nom=sc.next();
				
				Joueur leJoueurAModifier = null;
				for(Joueur j: daoJoueur.findAll()) {
					System.out.println(jou_nom);
					if (j.getJou_nom().equals(jou_nom)) { 
						leJoueurAModifier = j;  //si le nom du joueur j est égal au nom saisi, alors je change la valeur du joueur à modifier
					}
				}
				System.out.println("1-modifier le nom, 2-modifier le prénom, 3-modifier le nom d'utilisateur, 4-tout");
				 int choix2= sc.nextInt();
					switch (choix2) {
						case 1 :
							System.out.println("nouveau jou_nom ");
							jou_nom=sc.next();
							leJoueurAModifier.setJou_nom(jou_nom);
							daoJoueur.save(leJoueurAModifier,choix);
						break;
						case 2 :
							System.out.println("nouveau jou_prenom");
							jou_prenom=sc.next();
							joueur = new Joueur(jou_nom);
							joueur.setJou_prenom(jou_prenom);
							daoJoueur.save(joueur,choix);
						break;
						case 3 :
							System.out.println("nouveau jou_nomutilisateur");
							jou_nomutilisateur=sc.next();
							joueur = new Joueur(jou_nom);
							joueur.setJou_nomutilisateur(jou_nomutilisateur);
							daoJoueur.save(joueur,choix);
						break;
						case 4 :
							System.out.println("nouveau jou_nom ");
							jou_nom=sc.next();
							System.out.println("nouveau jou_prenom");
							jou_prenom=sc.next();
							System.out.println("nouveau jou_nomutilisateur");
							jou_nomutilisateur=sc.next();
							joueur = new Joueur(jou_nom);
							joueur.setJou_prenom(jou_prenom);
							joueur.setJou_nomutilisateur(jou_nomutilisateur);
							daoJoueur.save(joueur,choix);
						break;
					}
					break;
			}*/

/*//SUPPRESSION DU JOUEUR
	System.out.println("Quel joueur voulez vous supprimer ?");
	String nomjoueur= sc.nextLine();
	Joueur leJoueurASupprimer = null;
	for(Joueur s: daoJoueur.findAll()) {
		if (s.getJou_nom().equals(nomjoueur)) { 
			leJoueurASupprimer = s;  //si le nom du joueur j est égal au nom saisi, alors je change la valeur du joueur à modifier
		}
	}
	daoJoueur.delete(leJoueurASupprimer);
}*/
	
	/*// RECHERCHE D'UN JOUEUR:
	System.out.println("Quel joueur voulez vous chercher ?");
	String nomjoueur= sc.nextLine();
	Joueur leJoueurAChercher = new Joueur (nomjoueur);
	daoJoueur.find(leJoueurAChercher, nomjoueur);
	System.out.println(leJoueurAChercher.getJou_nom());
	*/
	/*// CREATION DU JOUEUR
			System.out.println("Voulez vous /n 1-ajouter un joueur /n modifier un joueur ?");
  			int choix= sc.nextInt();
  			switch (choix) {
  			case 1 :
				System.out.println("jou_id");
				int jou_id=sc.nextInt();
				System.out.println("jou_nom");
				String jou_nom=sc.next();
				System.out.println("jou_prenom");
				String jou_prenom=sc.next();
				System.out.println("jou_nomutilisateur");
				String jou_nomutilisateur=sc.next();
				Joueur joueur = new Joueur();
				joueur.setJou_id(jou_id);
				joueur.setJou_nom(jou_nom);
				joueur.setJou_prenom(jou_prenom);
				joueur.setJou_nomutilisateur(jou_nomutilisateur);
				daoJoueur.save(joueur,choix);
				break;
  			case 2 :
  				System.out.println("Saisissez le nom du joueur à modifier");
  				jou_nom=sc.nextLine();
  				sc.nextLine();
  				System.out.println("1-modifier le nom, 2-modifier le prénom, 3-modifier le nom d'utilisateur, 4-tout");
  				 int choix2= sc.nextInt();
  					switch (choix2) {
  						case 1 :
  							System.out.println("nouveau jou_nom ");
  							jou_nom=sc.next();
  							joueur = new Joueur();
  							joueur.setJou_nom(jou_nom);
  							daoJoueur.save(joueur,choix);
  						break;
  						case 2 :
  							System.out.println("nouveau jou_prenom");
  							jou_prenom=sc.next();
  							joueur = new Joueur();
  							joueur.setJou_prenom(jou_prenom);
  							daoJoueur.save(joueur,choix);
  						break;
  						case 3 :
  							System.out.println("nouveau jou_nomutilisateur");
  							jou_nomutilisateur=sc.next();
  							joueur = new Joueur();
  							joueur.setJou_nomutilisateur(jou_nomutilisateur);
  							daoJoueur.save(joueur,choix);
  						break;
  						case 4 :
  							System.out.println("nouveau jou_nom ");
  							jou_nom=sc.next();
  							System.out.println("nouveau jou_prenom");
  							jou_prenom=sc.next();
  							System.out.println("nouveau jou_nomutilisateur");
  							jou_nomutilisateur=sc.next();
  							joueur = new Joueur();
  							joueur.setJou_nom(jou_nom);
  							joueur.setJou_prenom(jou_prenom);
  							joueur.setJou_nomutilisateur(jou_nomutilisateur);
  							daoJoueur.save(joueur,choix);
  						break;
  					}
  					break;
  			}*/
			
	// CREATION DE LA PARTIE
			
/*			System.out.println("par_id");
			int par_id=sc.nextInt();
			System.out.println("par_niveau");
			String par_niveau=sc.next();
			System.out.println("par_idjoueur");
			int par_idjoueur=sc.nextInt();
			Partie partie = new Partie(par_id, par_niveau, par_idjoueur);
			daoPartie.save(partie);*/

// CREATION DE L'ADMINiSTRATEUR
			
/*			System.out.println("adm_mdp");
			int adm_mdp=sc.nextInt();
			System.out.println("adm_id");
			String adm_id=sc.next();
			Administrateur admin = new Administrateur(adm_mdp,adm_id);
			daoAdmin.save(admin);*/

/*// CREATION DES FIGURES

			System.out.println("fig_idpiece");
			int fig_idpiece=sc.nextInt();
			Figure figure = new Figure(fig_idpiece);
			daoFigure.save(figure);
// CREATION DES PIECES

			System.out.println("pie_nom");
			String pie_nom=sc.nextLine();
			System.out.println("pie_id");
			int pie_id=sc.nextInt();
			
			System.out.println("pie_couleur");
			String pie_couleur=sc.next();
			Piece piece = new Piece(pie_id,pie_nom,pie_couleur);
			daoPiece.save(piece);

// CREATION DES POINTS

			System.out.println("point_x");
			int point_x=sc.nextInt();
			System.out.println("point_y");
			int point_y =sc.nextInt();
			System.out.println("point_id");
			int point_id=sc.nextInt();
			System.out.println("point_idfigure");
			int point_idfigure=sc.nextInt();
			Point point = new Point(point_id,point_x,point_y,point_idfigure);
			daoPoint.save(point);	*/
}
}
