package com.learning.springBoot.learnJPAandHibernate.course.JPA;

import org.springframework.stereotype.Repository;

import com.learning.springBoot.learnJPAandHibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepo {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}
	
	public void deleteById(long id) throws Exception {
		Course course = entityManager.find(Course.class, id);
		if(course != null)
			entityManager.remove(course);
		else
			throw new Exception(" Invalid ID");
	}
	
}
