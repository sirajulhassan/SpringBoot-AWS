package com.learning.springBoot.spring.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloWorldConfiguration {

	record Person(String name,int age, Address address) {}
	record Address(String city,String State) {}
	
	@Bean
	public String name() {
		return "Benzin";
		
	}
	@Bean
	public int age() {
		return 30 ;
		
	}
	@Bean
	public String tech() {
		return "koodotram";
		
	}
	@Bean
	public Person person() {
	 var person = new Person("Shibin",50, new Address("Kochi", "Kerala"));
	 return person;
	 
	}
	
	/*
	 * Addresses
	 */	
	@Bean(name = "cityAddress01")
	public Address address01() {
		var address = new Address("red Street", "Mumbai");
		return address;
	}
	
	@Bean(name = "cityAddress02")
	@Primary
	public Address address02() {
		var address = new Address("Payyannur", "Kannur");
		return address;
	}
	
	//using bean inside bean
	
	@Bean
	public Person person2MethodCall() {
		var person = new Person(name(),age(), address01());
		return person;
	}
	@Bean
	public Person person2ParameterCall(String name, int age, Address cityAddress02) {
		var person = new Person(name,age, cityAddress02);
		return person;
	}

	/*
	 * handling multiple beans with same type method 1: use @Primary method2:
	 * use @qualifier on both method and before passed parameter
	 */
	
	@Bean(name = "cityAddress03")
	//@Primary
	@Qualifier("address")
	public Address address03() {
		var address = new Address("Kochi", "Eranakulam");
		return address;
	}
	//used the above qualifier with the parameter and can give any name for the parameter
	@Bean
	public Person person3ParameterCall(String name, int age, @Qualifier("address") Address cityAdd) {
		var person = new Person(name,age, cityAdd);
		return person;
	}
	
	
	
	
	 
}
