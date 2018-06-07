package tetrisWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccueilController {
	@GetMapping("/Accueil")
	public String afficherAccueil() {
		
		return "Accueil";
}
	}
