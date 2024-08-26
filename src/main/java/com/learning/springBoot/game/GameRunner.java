package com.learning.springBoot.game;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	private GameConsole game;
	
	public GameRunner(@Qualifier("contra") GameConsole game) {
		System.out.println("param: "+game );
		this.game = game;
		game.left();
		game.right();
		game.up();
		game.down();
	}
	public void run() {
		System.out.println("Using ruun method");
		game.left();
		game.right();
		game.up();
		game.down();
	}
	

}
