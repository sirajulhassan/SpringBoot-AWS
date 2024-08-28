package com.learning.springBoot.game;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan("com.learning.springBoot.game")
@ComponentScan // if no class is specified the current package will take for component scan
public class AGamingAppLauncherDependencyInjection {
	
	public static void main(String[] args) {	
		try(var context =new AnnotationConfigApplicationContext(AGamingAppLauncherDependencyInjection.class)){
			//context.getBean(GameRunner.class);
			System.out.println("Here");
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		
		
		
		}
	}
}
