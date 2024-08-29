package com.learning.springBoot.exercise;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
public class simpleBussinessExcercise {
	
	
	@Component
	class bussinessCalculationService{
		DataService dataService;
		public bussinessCalculationService(DataService dataService) {
			super();
			this.dataService = dataService;
		}
		
		public int findMax() {
			return Arrays.stream(dataService.retrieveData()).max().orElse(0);
		}
		
		
	}
	 
	public interface DataService{
		public int[] retrieveData();
	}
	
	@Component
	@Primary
	class MySQLservice implements DataService{
		@Override
		public int[] retrieveData(){
			return new int[] {11,22,33,44,55};
			
		}
	}
	@Component
	class MongoDBservice implements DataService{
		@Override
		public int[] retrieveData(){
			return new int[] {11,22,33,44,55};
			
		}
	}
	
	public static void main(String[] args) {	
		try(var context =new AnnotationConfigApplicationContext(simpleBussinessExcercise.class)){
			System.out.println("Here");
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(bussinessCalculationService.class).findMax());
		}
	}
}
