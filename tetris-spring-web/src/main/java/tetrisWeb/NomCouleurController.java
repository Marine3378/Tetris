package tetrisWeb;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import tetris.model.Piece;
import tetrisSpringJpa.IDAOFigure;
import tetrisSpringJpa.IDAOPiece;
@CrossOrigin("*")
@ResponseBody
@Controller
public class NomCouleurController {
	
	@Autowired
	private IDAOPiece daoPiece;
	
	@Autowired
	private IDAOFigure daoFigure;
	
	
	//Lister
	@GetMapping("/ListePiece")
	public String NomCouleur(Model model) {
		model.addAttribute("piece", daoPiece.findAll());
		return "ListePiece";
	}
	
	//Ajouter
	@GetMapping("/NomCouleur")
	public String ajouterPiece(Model model) {
		model.addAttribute("piece", new Piece());
		return "NomCouleur";
	}
	
	@PostMapping("/NomCouleur")
	public String ajouterPiece(@Valid @ModelAttribute Piece piece, BindingResult result) {
		if(result.hasErrors()) {
			return "NomCouleur";
		}
		daoPiece.save(piece);
		return "redirect:/ListePiece";
		
	}
	
	//Supprimer
	@GetMapping("/supprimerPiece")
	public String supprimerPiece(@RequestParam int id, Model model) {
		daoPiece.deleteById(id);
		return "redirect:/ListePiece";
	}
	
	//Modifier
	@GetMapping("/modifierPiece")
	public String modifierPiece(@RequestParam int id, Model model) {
		model.addAttribute("piece", daoPiece.findById(id).get());
		return "NomCouleur";
	}
	@PostMapping("/modifierPiece")
	public String modifierPiece(@Valid @ModelAttribute Piece piece, BindingResult result) {
		if(result.hasErrors()) {
			return "NomCouleur";
		}
		daoPiece.save(piece);
		return "redirect:/ListePiece";
	}
		
}
