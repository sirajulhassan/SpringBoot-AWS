package com.learning.springBoot.learnJPAandHibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.springBoot.learnJPAandHibernate.course.springJPA.SpringJPARepo;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
	//@Autowired
	//CourseJDBCRepo courseRepo;
	
	//@Autowired
	//CourseJPARepo jpaRepo;
	
	@Autowired
	SpringJPARepo springJPARepo;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		 * // ********* JDBC ************* //spring jdbc Insert qry
		 * courseRepo.insertBook(new Course(2,"course2", "auth2"));
		 * courseRepo.insertBook(new Course(3,"course3", "auth3"));
		 * courseRepo.insertBook(new Course(4,"course4", "auth4"));
		 * courseRepo.insertBook(new Course(5,"course5", "auth5"));
		 * 
		 * //spring jdbc DLT qry courseRepo.deleteById(3);
		 * 
		 * //spring jdbc select qry System.out.println(courseRepo.findById(2));
		 * System.out.println(courseRepo.findById(4));
		 */
		
		/*
		 * // ********* JPA *************
		 * 
		 * jpaRepo.insert(new Course(6,"JPAcourse6", "auth6")); jpaRepo.insert(new
		 * Course(7,"JPAcourse7", "auth7")); jpaRepo.insert(new Course(8,"JPAcourse8",
		 * "auth8")); System.out.println(jpaRepo.findById(6));
		 * System.out.println(jpaRepo.findById(7));
		 * System.out.println(jpaRepo.findById(8)); jpaRepo.deleteById(7);
		 */
		
		/*
		 * springJPARepo.save(new Course(2,"course2", "auth2")); springJPARepo.save(new
		 * Course(3,"course3", "auth3")); springJPARepo.save(new Course(4,"course4",
		 * "auth4")); springJPARepo.save(new Course(5,"course5", "auth5"));
		 * 
		 * // ********* Spring JPA *************
		 * 
		 * System.out.println(">>>>>>>>"+ springJPARepo.findById(3l));
		 * springJPARepo.deleteById(4l);
		 * 
		 * System.out.println("----------------------------------------");
		 * System.out.println(">>>>>>>>"+ springJPARepo.findAll());
		 * 
		 * //custom methods //custom method: define a method findBy followed by the java
		 * attribute of the property in the interface
		 * System.out.println("----------------------------------------");
		 * System.out.println("custom author>>"+ springJPARepo.findByAuthor("auth2"));
		 * System.out.println("custom author>>"+ springJPARepo.findByAuthor("auth8"));
		 * 
		 * System.out.println("----------------------------------------");
		 * System.out.println("custom name>>"+ springJPARepo.findByName("course2"));
		 * System.out.println("custom name>>"+ springJPARepo.findByName("test"));
		 */
	}

}
