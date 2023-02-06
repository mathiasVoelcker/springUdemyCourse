package com.springUdemyCourse.learnspringproject.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements Game {
    @Override
    public void up() {
        System.out.println("move up");
    }

    @Override
    public void down() {
        System.out.println("move down");
    }
}
