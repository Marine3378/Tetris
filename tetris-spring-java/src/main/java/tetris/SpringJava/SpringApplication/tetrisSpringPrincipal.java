package tetris.SpringJava.SpringApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tetris.SpringJava.config.AppConfig;
import tetris.SpringJpa.config.JPAConfig;


public class tetrisSpringPrincipal {
	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class, args);
	}

}
