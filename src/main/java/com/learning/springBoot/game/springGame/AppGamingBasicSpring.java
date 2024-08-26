package com.learning.springBoot.game.springGame;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learning.springBoot.game.GameRunner;


@Configuration
@ComponentScan("com.learning.springBoot.game")
public class AppGamingBasicSpring {
	
	public static void main(String[] args) {	
		try(var context =new AnnotationConfigApplicationContext(AppGamingBasicSpring.class)){
			context.getBean(GameRunner.class);
		}
	}
}
