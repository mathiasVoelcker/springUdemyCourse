package com.springUdemyCourse.learnspringproject.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PokemonGameQualifier")
public class PokemonGame implements Game {
    public void up() {
        System.out.println("Throw pokemon");
    }

    public void down() {
        System.out.println("Get down");
    }
}