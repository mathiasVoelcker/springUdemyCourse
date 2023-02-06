package com.springUdemyCourse.learnspringproject;

import com.springUdemyCourse.learnspringproject.game.Game;
import com.springUdemyCourse.learnspringproject.game.GameRunner;
import com.springUdemyCourse.learnspringproject.game.PacmanGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan("com.springUdemyCourse.learnspringproject.game")
public class LearnSpringProjectApplication {

//	@Bean
//	public GameRunner gameRunner(Game game) {
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}

	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(LearnSpringProjectApplication.class)) {
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
