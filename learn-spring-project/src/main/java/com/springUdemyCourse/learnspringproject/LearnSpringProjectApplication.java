package com.springUdemyCourse.learnspringproject;

import com.springUdemyCourse.learnspringproject.config.HelloWorldConfiguration;
import com.springUdemyCourse.learnspringproject.game.PacmanGame;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springUdemyCourse.learnspringproject.game.Game;
import com.springUdemyCourse.learnspringproject.game.GameRunner;
import com.springUdemyCourse.learnspringproject.game.GamingConfig;
import com.springUdemyCourse.learnspringproject.game.MarioGame;
import com.springUdemyCourse.learnspringproject.game.PokemonGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LearnSpringProjectApplication {

	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(GamingConfig.class)) {
			context.getBean(GameRunner.class).run();
			// context.getBean(Game.class).up();
		}

		// try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class) )
		// {	
		// 	System.out.println(context.getBean("name"));
		// 	System.out.println(context.getBean("age"));
		// 	System.out.println(context.getBean("person"));
		// 	System.out.println(context.getBean("theAddress"));
		// 	System.out.println(context.getBean("person2MethodCall"));
		// 	System.out.println(context.getBean("person3Parameter"));
		// 	System.out.println(context.getBean("person4WithQualifier"));

		// 	Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);	
		// }

	
	
		// System.out.println(Arrays.stream(context.getBeanDefinitionNames()));
		// System.out.println(context.getBean(Person.class));
		//1: Launch Sprint context
		//2: Configure what we want Spring framework to manage - @Configuration
	}

}
