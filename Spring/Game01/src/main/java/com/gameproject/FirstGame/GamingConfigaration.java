package com.gameproject.FirstGame;

import java.beans.BeanProperty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gameproject.FirstGame.game.GameRunner;
import com.gameproject.FirstGame.game.GamingConsole;
import com.gameproject.FirstGame.game.MarioGame;
import com.gameproject.FirstGame.game.Pacman;

@Configuration
public class GamingConfigaration {

	@Bean
	public GamingConsole game() {
		var game = new Pacman();
		return game;
	}

	@Bean
	public GameRunner GameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

}
