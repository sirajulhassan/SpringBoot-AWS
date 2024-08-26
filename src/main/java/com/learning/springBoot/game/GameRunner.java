package com.learning.springBoot.game;

public class GameRunner {
	private GameConsole game;
	
	public GameRunner(GameConsole game) {
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
