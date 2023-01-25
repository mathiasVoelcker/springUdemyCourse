package com.springUdemyCourse.learnspringproject;

import com.springUdemyCourse.learnspringproject.config.HelloWorldConfiguration;
import com.springUdemyCourse.learnspringproject.game.PacmanGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springUdemyCourse.learnspringproject.game.GameRunner;
import com.springUdemyCourse.learnspringproject.game.MarioGame;
import com.springUdemyCourse.learnspringproject.game.PokemonGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LearnSpringProjectApplication {

	public static void main(String[] args) {
		// var pokemonGame = new PokemonGame();
		// var marioGame = new MarioGame();
		// var pacmanGame = new PacmanGame();
        // var gameRunner = new GameRunner(marioGame);
		// var gameRunner2 = new GameRunner(pokemonGame);
		// var gameRunner3 = new GameRunner(pacmanGame);
        // gameRunner.run();
		// gameRunner2.run();

		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println(context.getBean("name"));
		//1: Launch Sprint context
		//2: Configure what we want Spring framework to manage - @Configuration
	}

}
