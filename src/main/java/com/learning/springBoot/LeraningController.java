package com.learning.springBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeraningController {
	@RequestMapping("/courses")
	public List<Course> getCourses(){
		return Arrays.asList(new Course(1,"Python"),
				new Course(1,"Java"));
		
	}
	
	
}
