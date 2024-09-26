package com.learning.springBoot.toDO.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Todo {
	@Id
	@GeneratedValue
	private int id;
	private String userName;
	
	// rule for the jakarta validation
	@Size(min = 5, message = "At least 5 characters are required")
	private String description;
	private LocalDate targetDate;
	private boolean done;
	@Column(name="customTestCoulumnName")
	private String testColumn;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTestColumn() {
		return testColumn;
	}
	public void setTestColumn(String testColumn) {
		this.testColumn = testColumn;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + userName + ", description=" + description + ", targetDate="
				+ targetDate + ", done=" + done + "]";
	}
	
	public Todo() {
		
	}
	public Todo(int id, String username, String description, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.userName = username;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
	}
	
	
	
}
