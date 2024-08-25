package com.learning.springBoot.game;

public class AppGamingBasic {

	public static void main(String[] args) {
		
		var mario = new MarioGame();
		var contra = new ContraGame();
		var pac = new PacManGame();
		
		var gameRunner = new GameRunner(pac);
	}

}
