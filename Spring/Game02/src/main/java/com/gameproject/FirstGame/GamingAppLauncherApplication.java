package com.gameproject.FirstGame;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.gameproject.FirstGame.game.GameRunner;
import com.gameproject.FirstGame.game.GamingConsole;
import com.gameproject.FirstGame.game.MarioGame;
import com.gameproject.FirstGame.game.Pacman;
import com.gameproject.FirstGame.game.superContraGame;

@Configuration
@ComponentScan("com.gameproject.FirstGame.game")
public class GamingAppLauncherApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
			context.getBean(GamingConsole.class).Up();
			context.getBean(GameRunner.class).run();
		}
	}

}
