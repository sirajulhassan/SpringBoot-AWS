package com.learning.springBoot.game.springGame;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.springBoot.game.GameConsole;
import com.learning.springBoot.game.GameRunner;
import com.learning.springBoot.game.PacManGame;

@Configuration
public class AppGamingBasicSpring {
	
	@Bean
	public GameConsole game() {
		var game = new PacManGame();
		return game;
		
	}
	@Bean
	GameRunner gameRunner(GameConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
		
	}
	
	public static void main(String[] args) {
		
		try(var context =new AnnotationConfigApplicationContext(AppGamingBasicSpring.class)){
			context.getBean(GameRunner.class);
		}
		
	
	}
}
