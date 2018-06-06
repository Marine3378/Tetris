package tetrisWeb;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tetris.model.Administrateur;
import tetris.model.Piece;




@Controller
public class ConnectionController {

	@GetMapping("/connectionTetris")
	public String login(Model model) {
		model.addAttribute("administrateur", new Administrateur());
		return "connectionTetris";
	}
	
	@PostMapping("/connectionTetris")
	public String login(@Valid @ModelAttribute Administrateur administrateur, BindingResult result ) {
		if(result.hasErrors()) {
				return "connectionTetris";
	}
		System.out.println(administrateur.getAdmMdp());
		System.out.println(administrateur.getNomUtilisateur());
		return "redirect:/plateauTetris";
}


}