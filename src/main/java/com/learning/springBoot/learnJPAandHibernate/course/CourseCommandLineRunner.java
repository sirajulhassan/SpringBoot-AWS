package com.learning.springBoot.learnJPAandHibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.springBoot.learnJPAandHibernate.course.jdbc.CourseJDBCRepo;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	CourseJDBCRepo courseRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		//spring jdbc Insert qry
		courseRepo.insertBook(new Course(2,"course2", "auth2"));
		courseRepo.insertBook(new Course(3,"course3", "auth3"));
		courseRepo.insertBook(new Course(4,"course4", "auth4"));
		courseRepo.insertBook(new Course(5,"course5", "auth5"));
		
		//spring jdbc DLT qry
		courseRepo.deleteById(3);
		
		//spring jdbc select qry
		System.out.println(courseRepo.findById(1));
		System.out.println(courseRepo.findById(2));
		
		
	}

}
