package com.springUdemyCourse.learnspringproject.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfig {
    
    @Bean
    public Game game() {
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner() {
        var gameRunner = new GameRunner(game());
        return gameRunner;
    }
}
