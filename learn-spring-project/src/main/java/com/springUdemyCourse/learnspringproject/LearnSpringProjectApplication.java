package com.springUdemyCourse.learnspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springUdemyCourse.learnspringproject.game.GameRunner;
import com.springUdemyCourse.learnspringproject.game.MarioGame;
import com.springUdemyCourse.learnspringproject.game.PokemonGame;

@SpringBootApplication
public class LearnSpringProjectApplication {

	public static void main(String[] args) {
		// System.out.print("============================================ TEST ============================================");
		var pokemonGame = new PokemonGame();
		var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();

		// SpringApplication.run(LearnSpringProjectApplication.class, args);
	}

}
