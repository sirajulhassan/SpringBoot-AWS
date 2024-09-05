package com.learning.springBoot.learnJPAandHibernate.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity //adding as part of JPA -if table name is different in database we need to specify name here
public class Course {

	@Id //adding as part of JPA -  if column name is dofferent we need to specify the name here using the @name=""
	private long id; 
	private String name;
	private String author;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public Course() {
		
	}
		
	
	
}
