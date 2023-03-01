package com.gameproject.FirstGame;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gameproject.FirstGame.game.GameRunner;
import com.gameproject.FirstGame.game.MarioGame;
import com.gameproject.FirstGame.game.Pacman;
import com.gameproject.FirstGame.game.superContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1. Launch a spring context 
		
		var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfigaration.class);
		//2. Configure the things that we want spring to manage- @Configaration
		
		//HelloWorldConfigaration - @Configaration
		//name - @Bean
		
		//3. Retrieving Beans managed by Spring
		System.out.println(context.getBean("Name"));
		
		
	}

}
