package tetrisWeb;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import tetris.model.Administrateur;
import tetris.model.Piece;




@Controller
@SessionAttributes
public class ConnectionController {
	

	@GetMapping("/connectionTetris")
	public String login(Model model,  Administrateur administrateur) {
		model.addAttribute("administrateur", administrateur = new Administrateur());
		
		return "connectionTetris";
	}
	
	@PostMapping("/connectionTetris")
	public String login(@Valid @ModelAttribute Administrateur administrateur, BindingResult result, HttpSession session ) {
		if(result.hasErrors()) {
				return "connectionTetris";
	}
		session.setAttribute("mySessionAttribute", administrateur.getNomUtilisateur());
		return "redirect:/Accueil";
}


}