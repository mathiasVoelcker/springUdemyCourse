package com.springUdemyCourse.learnspringproject.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements Game {
 
    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Go into hole");
    }

}
