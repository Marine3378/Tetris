package tetris.SpringJava.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import tetris.SpringJpa.config.JPAConfig;

@Configuration
@ComponentScan("tetris.SpringJava.SpringApplication")
@Import({JPAConfig.class})
public class AppConfig {

}
