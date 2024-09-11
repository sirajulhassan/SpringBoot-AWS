package com.learning.springBoot.toDO.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.springBoot.toDO.entities.Todo;

@Service
public class ToDoService {
 
	private static List<Todo> todos = new ArrayList<Todo>();
	
	static {
		todos.add(new Todo(1, "userName1", "pass1", LocalDate.now().plusDays(1), false));
		todos.add(new Todo(2, "userName2", "pass2", LocalDate.now().plusDays(2), false));
		todos.add(new Todo(3, "userName2", "pass3", LocalDate.now().plusDays(3), false));
	}
	
	public List<Todo> findByUserName(String userName){
		 return todos;
	}
	
}
