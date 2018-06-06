package tetrisWeb;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tetris.model.Administrateur;

@Controller
public class PlateauController {
	@GetMapping("/plateauTetris")
	public String afficherPlateau() {
		
		return "plateauTetris";
	}
	
	
	

}
