package com.gameproject.FirstGame.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	// MarioGame game;
	private GamingConsole game;

	public GameRunner(@Qualifier("MarioGameQ")  GamingConsole game) {
		this.game = game;

	}

	public void run() {
		System.out.println("Running game" + game);
		game.Up();
		game.Down();
		game.Left();
		game.Right();
	}

}
