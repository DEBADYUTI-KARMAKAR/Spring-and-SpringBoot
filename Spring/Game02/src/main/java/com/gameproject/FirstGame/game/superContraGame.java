package com.gameproject.FirstGame.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class superContraGame implements GamingConsole {

	public void Up() {
		System.out.println("up");
	}
	public void Down() {
		System.out.println("Sit down");
	}
	public void Left() {
		System.out.println("Go back");
	}
	public void Right() {
		System.out.println("Shoot a bullet");
		
	}
}
