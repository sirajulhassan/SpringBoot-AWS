package com.learning.springBoot;

import com.learning.springBoot.game.ContraGame;
import com.learning.springBoot.game.GameConsole;
import com.learning.springBoot.game.GameRunner;
import com.learning.springBoot.game.MarioGame;
import com.learning.springBoot.game.PacManGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		
		var mario = new MarioGame();
		var contra = new ContraGame();
		var pac = new PacManGame();
		
		var gameRunner = new GameRunner(pac);
	}

}
