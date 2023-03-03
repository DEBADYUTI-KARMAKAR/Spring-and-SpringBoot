package com.gameproject.FirstGame.game;

import org.springframework.stereotype.Component;

@Component
public class Pacman implements GamingConsole {

	public void Up() {
		System.out.println("UP");
	}
	public void Down() {
		System.out.println("Down");
	}
	public void Left() {
		System.out.println("Left");
	}
	public void Right() {
		System.out.println("Right");
		
	}
}
