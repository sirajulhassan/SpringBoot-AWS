package com.learning.springBoot.exercise;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ch.qos.logback.core.net.SyslogOutputStream;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;




//Spring Scope - Singleton and Prototype
//other scopes - request,session,Application,WebSocket
@Component
class SingletonClass{
	//one instance will created for one IOC 
}

@Component
@Scope("prototype")
class PrototypeClass{
	
	public PrototypeClass(){
		System.out.println("constructed");
	}
	@PostConstruct
	public void postConstruct() {
	 System.out.println("Post construct");
	}
	@PreDestroy
	public void preDestroty() {
		System.out.println("PreDestroy");		 
	}
}




@Configuration
@ComponentScan
public class AppLauncherScopeNJakartaNPostPRe {
	
	public static void main(String[] args) {	
		try(var context =new AnnotationConfigApplicationContext(AppLauncherScopeNJakartaNPostPRe.class)){
			System.out.println("Contect Initalization Completed");
			/*
			 * Singleton and prototype- singleton will have same hashcode for every call.
			 * prototype will have seperate instance every time 
			*/
			System.out.println("Calling singleton class");
			System.out.println(context.getBean(SingletonClass.class));
			System.out.println(context.getBean(SingletonClass.class));
			System.out.println(context.getBean(SingletonClass.class));
			System.out.println(context.getBean(SingletonClass.class));
			System.out.println("Calling prototype class");
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			
			// Jkarta Inject and Named
			
			
		}
	}
}
