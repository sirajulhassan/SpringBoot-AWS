package com.learning.springBoot.learnJPAandHibernate.course.springJPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.springBoot.learnJPAandHibernate.course.Course;

public interface SpringJPARepo extends JpaRepository<Course, Long> {
		
	//custom method: define a method findBy followed by the java attribute of the property in the interface
	 List<Course> findByAuthor(String author);
	 
	//custom method: define a method findBy followed by the java attribute of the property in the interface
		 List<Course> findByName(String name);
}
