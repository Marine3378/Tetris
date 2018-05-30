package tetris.SpringJava.SpringApplication;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import tetris.model.HibernateUtils;
import tetris.model.*;
import tetrisSpringJpa.IDAOPartie;
import tetrisSpringJpa.IDAOPoint;
import tetrisSpringJpa.IDAOFigure;
import tetrisSpringJpa.IDAOJoueur;
import tetrisSpringJpa.IDAOPiece;
import tetrisSpringJpa.IDAOAdministrateur;



public class AppConsole
{
	/*@Autowired
	private IDAOProduit daoProduit;
	
	public void run(String[] args) {
		System.out.println("LISTE DES PRODUITS");
		for (Produit p : daoProduit.findAll()) {
			System.out.println(p.getLibelle());
		}
		
		
		System.out.println("LISTE DES PRODUITS DONT LE PRIX EST COMPRIS ENTRE A ET B");
		for (Produit p : daoProduit.findByPrixBetween(10d, 100d)) {
			System.out.println(p.getLibelle());
		}
	}*/
	@Autowired
	private IDAOPiece daoPiece;
	@Autowired
	private IDAOFigure daoFigure;
	@Autowired
	private IDAOJoueur daoJoueur;
	@Autowired
	private IDAOAdministrateur daoAdministrateur;
	@Autowired
	private IDAOPoint daoPoint;
	@Autowired
	private IDAOPartie daoPartie;
	
	
	public void lectureTetris() {
		//IDAOPiece daoPiece = new DAOPieceJPA();
		//IDAOFigure daoFigure = new DAOFigureJPA();
				Scanner sc = new Scanner(System.in);
			System.out.println("Choisissez \n 1-Joueur \n 2-Administrateur \n 3-Piece \n 4-Figure \n 5-Point");
			int choixUltime = sc.nextInt();			
	switch (choixUltime) {
	case 1 :
	
		System.out.println("Voulez vous \n 1-ajouter \n 2-modifier un joueur ?");
		int choix = sc.nextInt();
		//IDAOJoueur daoJoueur = new DAOJoueurJPA(); 
		
		switch (choix) {
		case 1:
			System.out.println("jou_nom");
			String jouNom = sc.next();
			System.out.println("jou_prenom");
			String jouPrenom = sc.next();
			System.out.println("jou_nomutilisateur");
			String jouNomutilisateur = sc.next();
			Joueur joueur = new Joueur(jouNom);
			joueur.setJouPrenom(jouPrenom);
			joueur.setJouNomutilisateur(jouNomutilisateur);
			daoJoueur.save(joueur);
			break;
		case 2:
			System.out.println("Saisissez le nom du joueur � modifier");
			jouNom = sc.next();

			Joueur leJoueurAModifier = null;
			for (Joueur j : daoJoueur.findAll()) {
				System.out.println(jouNom);
				if (j.getJouNom().equals(jouNom)) {
					leJoueurAModifier = j; // si le nom du joueur j est �gal au nom saisi, alors je change la valeur du
											// joueur � modifier
				}
			}
			System.out.println("Choisissez \n 1-modifier le nom, \n 2-modifier le pr�nom, \n 3-modifier le nom d'utilisateur, \n 4-tout");
			int choix2 = sc.nextInt();
			switch (choix2) {
			case 1:
				System.out.println("nouveau nom ");
				jouNom = sc.next();
				leJoueurAModifier.setJouNom(jouNom);
				daoJoueur.save(leJoueurAModifier);
				break;
			case 2:
				System.out.println("nouveau pr�nom");
				jouPrenom = sc.next();
				joueur = new Joueur(jouNom);
				joueur.setJouPrenom(jouPrenom);
				daoJoueur.save(joueur);
				break;
			case 3:
				System.out.println("nouveau nom d'utilisateur");
				jouNomutilisateur = sc.next();
				joueur = new Joueur(jouNom);
				joueur.setJouNomutilisateur(jouNomutilisateur);
				daoJoueur.save(joueur);
				break;
			case 4:
				System.out.println("nouveau Nom ");
				jouNom = sc.next();
				System.out.println("nouveau pr�nom");
				jouPrenom = sc.next();
				System.out.println("nouveau nom d'utilisateur");
				jouNomutilisateur = sc.next();
				joueur = new Joueur(jouNom);
				joueur.setJouPrenom(jouPrenom);
				joueur.setJouNomutilisateur(jouNomutilisateur);
				daoJoueur.save(joueur);
				break;
			}
			break;
		}
break;
	case 2:
		System.out.println("Voulez vous \n 1-ajouter \n 2-modifier un administrateur ?");
		choix = sc.nextInt();
		//IDAOAdministrateur daoAdministrateur = new DAOAdministrateurJPA();
		switch (choix) {
		case 1:
			System.out.println("mot de passe");
			String admMdp = sc.next();
			Administrateur administrateur = new Administrateur();
			administrateur.setAdmMdp(admMdp);
			daoAdministrateur.save(administrateur);
			break;
		case 2:
			System.out.println("Saisissez l'id de l'administrateur � modifier");
			int admId = sc.nextInt();
			Administrateur adminAChanger = daoAdministrateur.findAdministrateurById(admId);
			System.out.println("Entrer un nouveau mot de passe");
			admMdp = sc.next();
			adminAChanger.setAdmMdp(admMdp);
			daoAdministrateur.save(adminAChanger);
			break;
		}
		break;
	case 3:
		System.out.println("Voulez vous \n 1-ajouter \n 2-modifier une pi�ce ?");
		choix = sc.nextInt();

		switch (choix) {
		case 1:
			System.out.println("Nom de la pi�ce");
			String pieNom = sc.next();
			System.out.println("Couleur de la pi�ce");
			String pieCouleur = sc.next();
			Piece piece = new Piece();
			piece.setPieNom(pieNom);
			piece.setPieCouleur(pieCouleur);
			daoPiece.save(piece);
			break;

		case 2:
			System.out.println("Saisissez le nom de la piece � modifier");
			pieNom = sc.next();
			Piece laPieceAModifier = null;
			for (Piece p : daoPiece.findAll()) {
				if (p.getPieNom().equals(pieNom)) {
					laPieceAModifier = p;
					}
				}
				System.out.println("Choisisssez \n 1-modifier le nom, \n 2-la couleur, \n 3-les 2");
				int choix2 = sc.nextInt();
				switch (choix2) {
				case 1:
					System.out.println("nouveau nom ");
					pieNom = sc.next();
					laPieceAModifier.setPieNom(pieNom);
					daoPiece.save(laPieceAModifier);
					break;
				case 2:
					System.out.println("nouvelle couleur");
					pieCouleur = sc.next();
					laPieceAModifier.setPieCouleur(pieCouleur);
					daoPiece.save(laPieceAModifier);
					break;
				case 3:
					System.out.println("nouveau nom");
					pieNom = sc.next();
					laPieceAModifier.setPieNom(pieNom);
					System.out.println("nouvelle couleur");
					pieCouleur = sc.next();
					laPieceAModifier.setPieCouleur(pieCouleur);
					daoPiece.save(laPieceAModifier);
					break;
				}
				break;
			}
break;
	case 4:
			System.out.println("Voulez vous \n 1-ajouter \n 2-modifier une figure ?");
			choix = sc.nextInt();
	
			switch (choix) {
			case 1:
				System.out.println("Veuillez saisir l'id de la pi�ce associ�e");
				int figIdPiece = sc.nextInt();
				Figure figure = new Figure();
				Piece pieceFigure = new Piece();
				pieceFigure = daoPiece.findPieceById(figIdPiece);
				figure.setPiece(pieceFigure);
				daoFigure.save(figure);
				break;
			case 2:
				System.out.println("Veuillez saisir l'id de la figure � modifier");
				int figureId = sc.nextInt();
				System.out.println("Veuillez saisir l'id de la pi�ce associ�e");
				figIdPiece = sc.nextInt();
				pieceFigure = daoPiece.findPieceById(figIdPiece);
				figure = daoFigure.findFigureById(figureId);
				figure.setPiece(pieceFigure);
				daoFigure.save(figure);
				break;
			}
break;
	case 5:
			System.out.println("Voulez vous \n 1-ajouter \n 2-modifier un point ?");
			choix = sc.nextInt();
			//IDAOPoint daoPoint = new DAOPointJPA();
			switch (choix) {
			case 1:
				System.out.println("Veuillez saisir le coordonn� x");
				int x = sc.nextInt();
				System.out.println("Veuillez saisir le coordonn� y");
				int y = sc.nextInt();
				System.out.println("Veuillez saisir l'id de la figure associ�e");
				int figureId = sc.nextInt();
				Point point = new Point();
				point.setPointX(x);
				point.setPointY(y);
				Figure figurePoint = daoFigure.findFigureById(figureId);
				point.setFigure(figurePoint);
				daoPoint.save(point);
				break;
			case 2:
				System.out.println("Choisissez \n 1-modifier x,y \n 2-figure associ�e \n 3-tout ");
				int choix2 = sc.nextInt();
				switch (choix2) {
				case 1:
					System.out.println("Saississez l'id du point � modifier");
					int pointId = sc.nextInt();
					point = daoPoint.findPointById(pointId);
					System.out.println("Saississez x");
					x = sc.nextInt();
					System.out.println("Veuillez saisir le coordonn� y");
					y = sc.nextInt();
					point.setPointX(x);
					point.setPointY(y);
					daoPoint.save(point);
					break;
				case 2:
					System.out.println("Saississez l'id du point � modifier");
					pointId = sc.nextInt();
					point = daoPoint.findPointById(pointId);
					System.out.println("Veuillez saisir l'id de la figure associ�e");
					figureId = sc.nextInt();
					figurePoint = daoFigure.findFigureById(figureId);
					point.setFigure(figurePoint);
					daoPoint.save(point);
					break;
				case 3:
					System.out.println("Saississez l'id du point � modifier");
					pointId = sc.nextInt();
					point = daoPoint.findPointById(pointId);
					System.out.println("Saississez x");
					x = sc.nextInt();
					System.out.println("Veuillez saisir le coordonn� y");
					y = sc.nextInt();
					System.out.println("Veuillez saisir l'id de la figure associ�e");
					figureId = sc.nextInt();
					figurePoint = daoFigure.findFigureById(figureId);
					point.setPointX(x);
					point.setPointX(y);
					point.setFigure(figurePoint);
					daoPoint.save(point);
					break;
				}
				break;

			}
break;}
			HibernateUtils.close();
		}
	}
