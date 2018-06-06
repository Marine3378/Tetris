package tetrisWeb;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class PlateauController {
	@GetMapping("/plateauTetris")
	public String afficherPlateau() {
		
		return "plateauTetris";
	}
	
	
	

}
