package com.learning.springBoot.game.springGame;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.learning.springBoot.game.GameRunner;


public class AppGamingBasicSpring {
	public static void main(String[] args) {
		
		try(var context =new AnnotationConfigApplicationContext(AppGamingBasicSpringConfig.class)){
			context.getBean(GameRunner.class);
		}
		
	
	}
}
