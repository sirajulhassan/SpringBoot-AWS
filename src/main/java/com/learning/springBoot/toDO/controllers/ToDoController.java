package com.learning.springBoot.toDO.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learning.springBoot.toDO.entities.Todo;
import com.learning.springBoot.toDO.services.LoginService;
import com.learning.springBoot.toDO.services.ToDoService;

import org.springframework.web.bind.annotation.RequestMethod;



@Controller
//@ResponseBody
public class ToDoController {
	
	ToDoService todoService;
	
	public ToDoController(ToDoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping(value = "list-todos", method=RequestMethod.GET)
	public String listTodos(ModelMap model) {
		List<Todo> todos = todoService.findByUserName("test");
		model.put("todos", todos);
		return  "listToDos";
	}
	
	@RequestMapping(value = "add-todo", method=RequestMethod.GET)
	public String showAddTodo(ModelMap model) {
		return  "addTodo";
	}
	
	@RequestMapping(value = "add-todo", method=RequestMethod.POST)
	public String addTodo(ModelMap model) {
		
		return  "redirect:list-todos";
	}
	
	
	
	
	
	
	
	
	
	
}
