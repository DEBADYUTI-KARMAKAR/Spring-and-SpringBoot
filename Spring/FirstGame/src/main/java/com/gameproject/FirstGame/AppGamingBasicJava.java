package com.gameproject.FirstGame;

import com.gameproject.FirstGame.game.GameRunner;
import com.gameproject.FirstGame.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var mariogame = new MarioGame();
		var gameRunner = new GameRunner(mariogame);
		gameRunner.run();
		
		
	}

}
