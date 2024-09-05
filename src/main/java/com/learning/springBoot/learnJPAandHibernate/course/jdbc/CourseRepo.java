package com.learning.springBoot.learnJPAandHibernate.course.jdbc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learning.springBoot.learnJPAandHibernate.course.Course;

@Repository
public class CourseRepo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String insert_query = 
			"""
			insert into course (id,name,author) values(?, ?, ?);	
			""";
	
	private static String delete_query = 
			"""
			delete from course where id = ?;	
			""";
	
	private static String select_query = 
			"""
			select * from course where id = ?;	
			""";
	
	
	public void insertBook(Course course) {
		
		jdbcTemplate.update(insert_query,course.getId(),course.getName(),course.getAuthor() );
		
	}
	
	public void deleteById(long id) {
			jdbcTemplate.update(delete_query,id );
			
	}
	// select query - for single entry qryforObject is used
	// second parameter is theh rowmapper,map the result_set to java bean
	public Course findById(long id) {
		return jdbcTemplate.queryForObject(select_query, new BeanPropertyRowMapper<>(Course.class), id) ;	
	}
	
	
}
