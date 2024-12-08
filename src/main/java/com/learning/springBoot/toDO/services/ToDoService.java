package com.learning.springBoot.toDO.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.learning.springBoot.toDO.entities.Todo;
import com.learning.springBoot.toDO.repositories.TodoRepo;

@Service
public class ToDoService {
	
	TodoRepo todoRepo;

	/*
	 * Contructors 
	 * 1)default 
	 * 2)Autowiring
	 * 
	 */
	
	public ToDoService(TodoRepo todoRepo) {
		super();
		this.todoRepo = todoRepo;
	}




	private static List<Todo> todos = new ArrayList<Todo>();
	private static int id = 0;
	static {
		todos.add(new Todo(++id, "admin", "adminSample", LocalDate.now().plusDays(1), false));
		todos.add(new Todo(++id, "userName2", "pass2", LocalDate.now().plusDays(2), false));
		todos.add(new Todo(++id, "userName2", "pass3", LocalDate.now().plusDays(3), false));
	}
	
	public List<Todo> findByUserName(String userName){
		
		Predicate<? super Todo> predictate= todo ->  todo.getUserName().equalsIgnoreCase(userName);
		System.out.println(String.format("getby username service-userName = %s|| todo list  = /n %s", userName,todoRepo.findByUserName(userName)));
		
		//return todos.stream().filter(predictate).toList();
		return todoRepo.findByUserName(userName);
	}

	public void addTodo(Todo todo) {
		//Todo todo = new Todo(++id, username, description, date, done);
		//todos.add(todo);
		
		//using JPA save to add the entity to database
		todoRepo.save(todo);
	}

	public List<Todo> deleteById(int id) {
		
		/* Using JPA instead of below code
		 * ----------------------------------
		 * Predicate<? super Todo> predictate= todo -> todo.getId() == id ;
		 * todos.removeIf(predictate);
		 */
		
		todoRepo.deleteById(id);
		return null;
	}

	public Todo updateById(int id) {
		
		Predicate<? super Todo> predictate = todo -> todo.getId()==id;
		
		//Todo todo = todos.stream().filter(predictate).findFirst().get(); 
		Todo todo = todoRepo.getById(id);
		System.out.println("Todo :: "+todo);
		return todo;
	}

	public void updateTodo(Todo todo) {
		/*updated below code to use JPA
		 * --------------------------------------
		 * 
		 * deleteById(todo.getId()); todos.add(todo);
		 */
		todoRepo.save(todo);
	}
	
}
