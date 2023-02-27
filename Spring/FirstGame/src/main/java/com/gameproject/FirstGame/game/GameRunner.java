package com.gameproject.FirstGame.game;

public class GameRunner {
	//MarioGame game;
	superContraGame game;
	
	public GameRunner(superContraGame game) {
		this.game = game;
		
	}
	public void run() {
		System.out.println("Running game"+game);
		game.Up();
		game.Down();
		game.Left();
		game.Right();
	}

}
