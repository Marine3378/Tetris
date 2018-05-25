
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tetris.model.*;

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
		
//JPA		
		
		
/*		IDAOAdministrateur daoAdministrateur= new DAOAdministrateurJPA();
		IDAOPiece daoPiece= new DAOPieceJPA();
		IDAOFigure daoFigure= new DAOFigureJPA();
		IDAOPartie daoPartie= new DAOPartieJPA();
		IDAOPoint daoPoint= new DAOPointJPA();
		IDAOJoueur daoJoueur= new DAOJoueurJPA();
//ADMINISTRATEUR	
		Administrateur admin1 = new Administrateur();
		admin1.setAdmMdp("fzufh");
		//daoAdministrateur.save(admin1);
		//admin1.setAdmId(3);
		//daoAdministrateur.delete(admin1);
		//daoAdministrateur.findById(4);
		//daoAdministrateur.findAll();
		
//PIECE		
		Piece pieceA = new Piece("cube","rouge");
		Piece pieceB = new Piece();
		pieceB.setPieCouleur("orange");
		pieceB.setPieNom("losange");
		//daoPiece.save(pieceB);
		
		//admin1.setAdmId(3);
		//daoAdministrateur.delete(admin1);
		//System.out.println(daoPiece.findById(4));
		//System.out.println(daoPiece.findAll());
		
		//daoPiece.delete(pieceB);

//JOUEUR		
		Joueur joueurA = new Joueur("toto");
		joueurA.setJouNomutilisateur("utilisateur");
		joueurA.setJouPrenom("tizfn");
		daoJoueur.save(joueurA);
		Joueur joueurB = new Joueur("tata");
		daoJoueur.save(joueurB);
		Joueur joueurC = new Joueur("titi");
		daoJoueur.save(joueurC);
		Joueur joueurA = new Joueur();
		joueurA.setJouId(1);
		daoJoueur.delete(joueurA);
		
		//System.out.println(daoJoueur.findById(2));
		//System.out.println(daoJoueur.findAll());
		
//PARTIE
		Partie partieA = new Partie();
		Partie partieB = new Partie();
		Partie partieC = new Partie();
		partieA.setParNiveau("155");
		partieA.setParScore(345851514);
		partieA.setJoueur(joueurA);
		//daoPartie.save(partieA);
		//daoPartie.save(partieB);
		//daoPartie.save(partieC);
		//partieA.setParId(1);
		//daoPartie.delete(partieA);
		
		//System.out.println(daoPartie.findById(2));
		//System.out.println(daoPartie.findAll());
				
//FIGURE
		Figure figureA = new Figure();
		Figure figureB = new Figure();
		Figure figureC = new Figure();
		pieceA.setPieId(5);
		figureA.setPiece(pieceA);
		daoFigure.save(figureA);
		//daoFigure.save(figureB);
		//daoFigure.save(figureC);

		//figureA.setFigId(1);
		//daoFigure.delete(figureA);
		
		//System.out.println(daoFigure.findById(2));
		//System.out.println(daoFigure.findAll());

//POINT
		Point pointA = new Point(1,1);
		Point pointB = new Point(1,2);
		Point pointC = new Point(1,3);
		pointA.setFigure(figureA);
		daoPoint.save(pointA);
		//daoPoint.save(pointB);
		//daoPoint.save(pointC);

		Point pointD = new Point();
		pointD.setPointId(1);
		daoPoint.delete(pointD);
		
		//System.out.println(daoPoint.findById(2));
		//System.out.println(daoPoint.findAll());*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Voulez vous /n 1-ajouter /n modifier un joueur ?");
		int choix= sc.nextInt();
		IDAOJoueur daoJoueur = new DAOJoueurJPA();
		switch (choix) {
			case 1 :
				System.out.println("jou_nom");
				String jouNom=sc.next();
				System.out.println("jou_prenom");
				String jouPrenom=sc.next();
				System.out.println("jou_nomutilisateur");
				String jouNomutilisateur=sc.next();
				Joueur joueur = new Joueur(jouNom);
				joueur.setJouPrenom(jouPrenom);
				joueur.setJouNomutilisateur(jouNomutilisateur);
				daoJoueur.save(joueur);
			case 2 :
				System.out.println("Saisissez le nom du joueur à modifier");
				jouNom=sc.next();
				
				Joueur leJoueurAModifier = null;
				for(Joueur j: daoJoueur.findAll()) {
					System.out.println(jouNom);
					if (j.getJouNom().equals(jouNom)) { 
						leJoueurAModifier = j;  //si le nom du joueur j est égal au nom saisi, alors je change la valeur du joueur à modifier
					}
				}
				System.out.println("1-modifier le nom, 2-modifier le prénom, 3-modifier le nom d'utilisateur, 4-tout");
				 int choix2= sc.nextInt();
					switch (choix2) {
						case 1 :
							System.out.println("nouveau nom ");
							jouNom=sc.next();
							leJoueurAModifier.setJouNom(jouNom);
							daoJoueur.save(leJoueurAModifier);
						break;
						case 2 :
							System.out.println("nouveau prénom");
							jouPrenom=sc.next();
							joueur = new Joueur(jouNom);
							joueur.setJouPrenom(jouPrenom);
							daoJoueur.save(joueur);
						break;
						case 3 :
							System.out.println("nouveau nom d'utilisateur");
							jouNomutilisateur=sc.next();
							joueur = new Joueur(jouNom);
							joueur.setJouNomutilisateur(jouNomutilisateur);
							daoJoueur.save(joueur);
						break;
						case 4 :
							System.out.println("nouveau Nom ");
							jouNom=sc.next();
							System.out.println("nouveau prénom");
							jouPrenom=sc.next();
							System.out.println("nouveau nom d'utilisateur");
							jouNomutilisateur=sc.next();
							joueur = new Joueur(jouNom);
							joueur.setJouPrenom(jouPrenom);
							joueur.setJouNomutilisateur(jouNomutilisateur);
							daoJoueur.save(joueur);
						break;
					}
					break;
			}
		
		System.out.println("Voulez vous /n 1-ajouter /n modifier un administrateur ?");
		choix= sc.nextInt();
		IDAOAdministrateur daoAdministrateur = new DAOAdministrateurJPA();
		switch (choix) {
			case 1 :
				System.out.println("mot de passe");
				String admMdp=sc.next();
				Administrateur administrateur  = new Administrateur ();
				administrateur.setAdmMdp(admMdp);
				daoAdministrateur.save(administrateur);
			case 2 :
				System.out.println("Saisissez l'id de l'administrateur à modifier");
				int admId=sc.nextInt();
				Administrateur adminAChanger = daoAdministrateur.findById(admId);
				System.out.println("Entrer un nouveau mot de passe");
				admMdp = sc.next();
				adminAChanger.setAdmMdp(admMdp);
				daoAdministrateur.save(adminAChanger);
				break;
					}
		System.out.println("Voulez vous /n 1-ajouter /n modifier une pièce ?");
		choix= sc.nextInt();
		IDAOPiece daoPiece = new DAOPieceJPA();
		switch (choix) {
			case 1 :
				System.out.println("Nom de la pièce");
				String pieNom=sc.next();
				System.out.println("Couleur de la pièce");
				String pieCouleur=sc.next();
				Piece piece = new Piece();
				piece.setPieNom(pieNom);
				piece.setPieCouleur(pieCouleur);
				daoPiece.save(piece);
			case 2 :
				System.out.println("Saisissez le nom de la piece à modifier");
				pieNom=sc.next();
				Piece laPieceAModifier = null;
				for(Piece p: daoPiece.findAll()) {
					if (p.getPieNom().equals(pieNom)) { 
						laPieceAModifier = p;  
				}
				System.out.println("1-modifier le nom, 2-la couleur,3-les 2");
				 int choix2= sc.nextInt();
					switch (choix2) {
						case 1 :
							System.out.println("nouveau nom ");
							pieNom=sc.next();
							laPieceAModifier.setPieNom(pieNom);
							daoPiece.save(laPieceAModifier);
						break;
						case 2 :
							System.out.println("nouvelle couleur");
							pieCouleur=sc.next();
							laPieceAModifier.setPieCouleur(pieCouleur);
							daoPiece.save(laPieceAModifier);
						break;
						case 3 :
							System.out.println("nouveau nom");
							pieNom=sc.next();
							laPieceAModifier.setPieNom(pieNom);
							System.out.println("nouvelle couleur");
							pieCouleur=sc.next();
							laPieceAModifier.setPieCouleur(pieCouleur);
							daoPiece.save(laPieceAModifier);
						break;
					}
					
				System.out.println("Voulez vous /n 1-ajouter /n modifier une figure ?");
				choix= sc.nextInt();
				IDAOFigure daoFigure = new DAOFigureJPA();
				switch (choix) {
					case 1 :
						System.out.println("Veuillez saisir l'id de la pièce associée");
						int figIdPiece=sc.nextInt();
						Figure figure = new Figure();
						Piece pieceFigure = new Piece();
						pieceFigure = daoPiece.findById(figIdPiece);
						figure.setPiece(pieceFigure);
						daoFigure.save(figure);
						break;
					case 2 :
						System.out.println("Veuillez saisir l'id de la figure à modifier");
						int figureId = sc.nextInt();
						System.out.println("Veuillez saisir l'id de la pièce associée");
						figIdPiece=sc.nextInt();
						pieceFigure = daoPiece.findById(figIdPiece);
						figure = daoFigure.findById(figureId);
						figure.setPiece(pieceFigure);
						daoFigure.save(figure);
						break;
				}
						
				System.out.println("Voulez vous /n 1-ajouter /n modifier un point ?");
				choix= sc.nextInt();
				IDAOPoint daoPoint = new DAOPointJPA();
				switch (choix) {
					case 1 :
						System.out.println("Veuillez saisir le coordonné x");
						int x=sc.nextInt();
						System.out.println("Veuillez saisir le coordonné y");
						int y=sc.nextInt();
						System.out.println("Veuillez saisir l'id de la figure associée");
						int figureId = sc.nextInt();
						Point point = new Point();
						point.setPointX(x);
						point.setPointX(y);
						Figure figurePoint = daoFigure.findById(figureId);
						point.setFigure(figurePoint);
						daoPoint.save(point);
						break;
					case 2 :
						System.out.println("1-modifier x,y \n 2-figure associée \n 3-tout ");
						choix2= sc.nextInt();
						switch (choix2) {
							case 1 :
								System.out.println("Saississez l'id du point à modifier");
								int pointId = sc.nextInt();
								point = daoPoint.findById(pointId);
								System.out.println("Saississez x");
								x=sc.nextInt();
								System.out.println("Veuillez saisir le coordonné y");
								y=sc.nextInt();
								point.setPointX(x);
								point.setPointX(y);
								daoPoint.save(point);
								break;
							case 2 :
								System.out.println("Saississez l'id du point à modifier");
								pointId = sc.nextInt();
								point = daoPoint.findById(pointId);
								System.out.println("Veuillez saisir l'id de la figure associée");
								figureId = sc.nextInt();
								figurePoint = daoFigure.findById(figureId);
								point.setFigure(figurePoint);
								daoPoint.save(point);
							case 3 :
								System.out.println("Saississez l'id du point à modifier");
								pointId = sc.nextInt();
								point = daoPoint.findById(pointId);
								System.out.println("Saississez x");
								x=sc.nextInt();
								System.out.println("Veuillez saisir le coordonné y");
								y=sc.nextInt();
								System.out.println("Veuillez saisir l'id de la figure associée");
								figureId = sc.nextInt();
								figurePoint = daoFigure.findById(figureId);
								point.setPointX(x);
								point.setPointX(y);
								point.setFigure(figurePoint);
								daoPoint.save(point);
								break;
						}
						
						
				
				}			

		
		HibernateUtils.close();
}}}
	}

