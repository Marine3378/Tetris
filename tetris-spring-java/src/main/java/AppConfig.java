import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import fr.formation.config.JpaConfig;

@Configuration
@ComponentScan({ "tetrisSpringJpa" })
@Import({ JpaConfig.class })
public class AppConfig {

}
