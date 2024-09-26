package com.learning.springBoot.toDO.controllers;

import java.text.MessageFormat;
import java.util.List;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.learning.springBoot.toDO.entities.Todo;
import com.learning.springBoot.toDO.services.ToDoService;

import jakarta.validation.Valid;



@Controller
public class ToDoController {
	
	ToDoService todoService;
	
	public ToDoController(ToDoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	//list all todo
	@RequestMapping(value = "list-todos", method=RequestMethod.GET)
	public String listTodos(ModelMap model) {
		model.put("name", getLoggedUser());
		List<Todo> todos = todoService.findByUserName(getLoggedUser());
		model.put("todos", todos);
		return  "listToDos";
	}
	
	
	// add a new todo
	@RequestMapping(value = "add-todo", method=RequestMethod.GET)
	public String showAddTodo(ModelMap model) {
		 model.addAttribute("todo", new Todo(0, getLoggedUser(), "", null, false));
		return  "addTodo";
	}

	
	
	// added valid tag for enable the form validation
	// BindinResult is used to get the result status for verifying any errors 
	@RequestMapping(value = "add-todo", method=RequestMethod.POST)
	public String addTodo(@Valid Todo todo, BindingResult result,ModelMap model) {
		if(result.hasErrors()) {
			model.put("todo", todo);
			System.out.println("inside error loop");
			return "addTodo";
		}else {
			todoService.addTodo(getLoggedUser(),todo.getDescription(), todo.getTargetDate(),false);
			return "redirect:list-todos";
		}
		
	}
	
	
	// deleteing
	@RequestMapping(value = "delete-todo", method=RequestMethod.GET)
	public String deleteTodo(ModelMap model, @RequestParam int id) {
		
		System.out.println(MessageFormat.format("this is id from delete-todo{0}",id));
		
		todoService.deleteById(id);
		return  "redirect:list-todos";
	}
	
	
	//update-todo Get
	@RequestMapping(value = "update-todo", method=RequestMethod.GET)
	public String showUpdateTodo(ModelMap model, @RequestParam int id) {
		Todo todo = todoService.updateById(id);
		model.addAttribute("todo", todo);
		return  "addTodo";
	}
	
	//update Post
	@RequestMapping(value = "update-todo", method=RequestMethod.POST)
	public String updateTodo(@Valid Todo todo, BindingResult result,ModelMap model) {
		if(result.hasErrors()) {
			model.put("todo", todo);
			return "addTodo";
		}else {
			todo.setUsername(getLoggedUser());
			todoService.updateTodo(todo);
			return "redirect:list-todos";
		}
	}
	//
	
	private String getLoggedUser() {
		 return SecurityContextHolder.getContext().getAuthentication().getName();
	}
	
	
	
}//class end
