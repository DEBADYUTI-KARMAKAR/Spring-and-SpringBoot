package com.gameproject.FirstGame.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MarioGameQ")
public class MarioGame implements GamingConsole {
	public void Up() {
		System.out.println("Jump");
	}
	public void Down() {
		System.out.println("Go into a hole");
	}
	public void Left() {
		System.out.println("Go back");
	}
	public void Right() {
		System.out.println("Accelarate");
		
	}

}
