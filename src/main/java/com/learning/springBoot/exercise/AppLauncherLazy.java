package com.learning.springBoot.exercise;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import ch.qos.logback.core.net.SyslogOutputStream;



/*
 * ++Dependency Injection start++
 * 
 * @AUTOWIRED
 * 1. Field based Dependency Injection
 * 2. constructor based Dependency Injection
 * 3. setter based  Dependency Injection

*/

@Component
@org.springframework.context.annotation.Lazy
class Lazy{
	public Lazy() {
		System.out.println("Lazy initalized");
	}
}
@Component
class Eager{
	
	public Eager() {
		System.out.println("Eager initalized");
	}
	
}
@Component
class LazyExample{
}


@Configuration
@ComponentScan
public class AppLauncherLazy {
	
	public static void main(String[] args) {	
		try(var context =new AnnotationConfigApplicationContext(AppLauncherLazy.class)){
			//eager should be initalized by now
			System.out.println("Contect Initalization Completed");
			
			//lazy will only initialized when it is being called	
			System.out.println(context.getBean(Lazy.class));
		}
	}
}
