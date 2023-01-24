package com.springUdemyCourse.learnspringproject.game;

public class GameRunner {

    Game game;

    public GameRunner(Game game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
    }


    
}
