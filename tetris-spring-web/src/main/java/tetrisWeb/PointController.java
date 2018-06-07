package tetrisWeb;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tetris.model.Figure;
import tetris.model.Piece;
import tetris.model.Point;
import tetrisSpringJpa.IDAOFigure;
import tetrisSpringJpa.IDAOPoint;

@Controller
public class PointController {
	
	@Autowired
	private IDAOPoint daoPoint;
	@Autowired
	private IDAOFigure daoFigure;
	
	//Lister
	@GetMapping("/ListePoint")
	public String listerPoint(Model model, int id, Figure figure) {
		model.addAttribute("figure", daoFigure.findById(id).get());
		model.addAttribute("points", daoPoint.findAllPointByFigure(figure));
		return "ListePoint";
	}
	
	//Ajouter
	@GetMapping("/formulairePoint")
	public String ajouterPoint(Model model, Figure figure, Point point) {
		
		//figure = new Figure();
		//figure.setId(id);
		//point.setFigure(figure);
		return "formulairePoint";
	}
	
	@PostMapping("/formulairePoint")
	public String ajouterPoint(@Valid @ModelAttribute Point point, BindingResult result,@RequestParam int id, Figure figure) {
		if(result.hasErrors()) {
			return "formulairePoint";
		}
		figure = new Figure();
		figure.setId(id);
		point.setFigure(figure);
		daoPoint.save(point);
		return "redirect:/ListePoint?id=" + id;
		
	}
	
	//Supprimer
	@GetMapping("/supprimerPoint")
	public String supprimerPoint(@RequestParam int id, Model model, Figure figure, Point point) {
		point = daoPoint.findById(id).get();
		figure = point.getFigure();
		int idFigure = figure.getId();
		daoPoint.deleteById(id);
		return "redirect:/ListePoint?id="+idFigure;
	}
	
	//Modifier
	@GetMapping("/modifierPoint")
	public String modifierPoint(@RequestParam int id, Model model) {
		model.addAttribute("point", daoPoint.findById(id).get());
		return "formulairePoint";
	}
	@PostMapping("/modifierPoint")
	public String modifierPoint(@Valid @ModelAttribute Point point, BindingResult result, Figure figure, @RequestParam int id) {
		if(result.hasErrors()) {
			return "formulairePoint";
		}
		figure = new Figure();
		figure.setId(id);
		point.setFigure(figure);
		daoPoint.save(point);
		return "redirect:/ListePoint?id="+id;
	}
		
}