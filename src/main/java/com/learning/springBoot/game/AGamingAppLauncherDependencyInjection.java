package com.learning.springBoot.game;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



/*
 * ++Dependency Injection start++
 * 
 * @AUTOWIRED
 * 1. Field based Dependency Injection
 * 2. constructor based Dependency Injection
 * 3. setter based  Dependency Injection

*/

@Component
class Dependency1{
	
}
@Component
class Dependency2{
	
}
@Component
class BussinessClass{
	
	//1. field-based
	//@Autowired
	Dependency1 dep1;
	//@Autowired
	Dependency2 dep2;
	
	/*
	//2. Setter-based
	@Autowired
	public void setDep1(Dependency1 dep1) {
		this.dep1 = dep1;
	}

	@Autowired
	public void setDep2(Dependency2 dep2) {
		this.dep2 = dep2;
	}
	*/
	
	// 3. constructor based (most preferred )
	// @Autowired -in contructor based , no need to specify autowired
	public BussinessClass(Dependency1 dep1, Dependency2 dep2) {
		super();
		this.dep1 = dep1;
		this.dep2 = dep2;
	}
	
	
	
	
	@Override
	public String toString() {
		return "BussinessClass [dep1=" + dep1 + ", dep2=" + dep2 + "]";
	}

	


	
	
	
	
	
	
}

/*
 * Dependency Injection end
 */


















@Configuration
//@ComponentScan("com.learning.springBoot.game")
@ComponentScan // if no class is specified the current package will take for component scan
public class AGamingAppLauncherDependencyInjection {
	
	public static void main(String[] args) {	
		try(var context =new AnnotationConfigApplicationContext(AGamingAppLauncherDependencyInjection.class)){
			//context.getBean(GameRunner.class);
			System.out.println("Here");
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
			System.out.println(context.getBean(BussinessClass.class).toString());
		
		
		}
	}
}
