package com.learning.springBoot.toDO.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.learning.springBoot.toDO.entities.Todo;

@Service
public class ToDoService {
 
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int id = 0;
	static {
		todos.add(new Todo(++id, "userName1", "pass1", LocalDate.now().plusDays(1), false));
		todos.add(new Todo(++id, "userName2", "pass2", LocalDate.now().plusDays(2), false));
		todos.add(new Todo(++id, "userName2", "pass3", LocalDate.now().plusDays(3), false));
	}
	
	public List<Todo> findByUserName(String userName){
		 return todos;
	}

	public void addTodo(String username, String description, LocalDate date, boolean done) {
		Todo todo = new Todo(++id, username, description, date, done);
		todos.add(todo);
	}

	public List<Todo> deleteById(int id) {
		
		Predicate<? super Todo> predictate= todo ->  todo.getId() == id ;
		todos.removeIf(predictate);
		return null;
	}
	
}
