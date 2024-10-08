package com.learning.springBoot.spring.helloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.springBoot.spring.helloWorld.HelloWorldConfiguration.Address;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		//resource try to avoid data leakage
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);){

			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("cityAddress01")); //custom bean name
			System.out.println(context.getBean(Address.class));//getting bean by type
			
			//Using bean inside bean
			System.out.println("method Bean:"+context.getBean("person2MethodCall")); // make use of bean using method call
			System.out.println("Parameter Bean:"+context.getBean("person2ParameterCall")); // make use of bean using method call
			
			//handling exception: multiple beans 
			System.out.println("handling multiple same type Bean:"+context.getBean("person3ParameterCall"));
		}
		
		
	}

}
