package com.learning.springBoot;

public class Course {
	private int course_id;
	private String course_name;
	
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	@Override
	public String toString() {
		return "Course [course_name=" + course_name + ", course_id=" + course_id + "]";
	}
	public Course(int course_id, String course_name) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
	}
	
	
	
	
}
