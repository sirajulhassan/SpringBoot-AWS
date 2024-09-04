package com.learning.springBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeraningController {
	@Autowired
	CurrencyServiceConfigurationExample currencyServiceConfigurationExample;
	
	@RequestMapping("/courses")
	public List<Course> getCourses(){
		
		//testing externalizing configuration
		System.out.println(currencyServiceConfigurationExample.getUrl());
		System.out.println(currencyServiceConfigurationExample.getUser());
		System.out.println(currencyServiceConfigurationExample.getKey());
		
		return Arrays.asList(new Course(1,"Python"),
				new Course(2,"Java"),
				new Course(3,"C#"),
				new Course(4,"MySQL"));
		
	}
	
	
}
