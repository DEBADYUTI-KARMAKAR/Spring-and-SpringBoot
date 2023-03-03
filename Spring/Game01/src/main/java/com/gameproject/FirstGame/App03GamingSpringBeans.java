package com.gameproject.FirstGame;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gameproject.FirstGame.game.GameRunner;
import com.gameproject.FirstGame.game.GamingConsole;
import com.gameproject.FirstGame.game.MarioGame;
import com.gameproject.FirstGame.game.Pacman;
import com.gameproject.FirstGame.game.superContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (var context = new AnnotationConfigApplicationContext(GamingConfigaration.class)) {
			context.getBean(GamingConsole.class).Up();
			context.getBean(GameRunner.class).run();
		}
	}

}
