package com.learning.springBoot.toDO.controllers;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.learning.springBoot.toDO.entities.Todo;
import com.learning.springBoot.toDO.services.ToDoService;



@Controller
//@ResponseBody
@SessionAttributes("name")
public class ToDoController {
	
	ToDoService todoService;
	
	public ToDoController(ToDoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping(value = "list-todos", method=RequestMethod.GET)
	public String listTodos(ModelMap model, @SessionAttribute("name") String name) {
		model.put("name", name);
		System.out.println(MessageFormat.format("this is name from list-todo{0}",(String)model.get("name")));
		
		List<Todo> todos = todoService.findByUserName("test");
		model.put("todos", todos);
		return  "listToDos";
	}
	
	
	
	@RequestMapping(value = "add-todo", method=RequestMethod.GET)
	public String showAddTodo(ModelMap model) {
		 model.addAttribute("todo", new Todo(0, (String)model.get("name"), "default", null, false));
		return  "addTodo";
	}
	
	@RequestMapping(value = "add-todo", method=RequestMethod.POST)
	public String addTodo(@ModelAttribute Todo todo,ModelMap model) {
		todoService.addTodo((String)model.get("name"),todo.getDescription(), LocalDate.now().plusDays(2),false);
		return  "redirect:list-todos";
	}
	
	
	
	
	
	
	
	
	
	
}
