package tetrisWeb;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tetris.model.Figure;
import tetris.model.Piece;
import tetrisSpringJpa.IDAOFigure;
import tetrisSpringJpa.IDAOPiece;

@Controller
public class FigureController {

	@Autowired
	private IDAOFigure daoFigure;
	
	@Autowired
	private IDAOPiece daoPiece;
	

	
	//Lister
		@GetMapping("/ListerFigure")
		public String listerFigure(Model model, Piece piece, int id) {
			model.addAttribute("piece", daoPiece.findById(id).get());
			model.addAttribute("figures", daoFigure.findAllFigureByPiece(piece));
			return "ListerFigure";
		}
		
		//Ajouter
		
			@GetMapping("/ajouterFigure")
			public String ajouterFigure(@RequestParam int id) {
				Figure figure = new Figure();
				Piece piece = new Piece();
				piece.setId(id);
				figure.setPiece(piece);
				daoFigure.save(figure);
				return "redirect:/ListerFigure?id=" + id;
				
			}
			
		
		//Supprimer
		@GetMapping("/supprimerFigure")
		public String supprimerPiece(Figure figure, @RequestParam int id, Model model) {
			 figure = daoFigure.findById(id).get();
			 Piece piece = figure.getPiece();
			 int idPiece =piece.getId();
			daoFigure.deleteById(id);
			return "redirect:/ListerFigure?id="+idPiece;
		}
		
		
			
}
