package com.learning.springBoot.learnJPAandHibernate.course.springJPA;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.springBoot.learnJPAandHibernate.course.Course;

public interface SpringJPARepo extends JpaRepository<Course, Long> {

}
