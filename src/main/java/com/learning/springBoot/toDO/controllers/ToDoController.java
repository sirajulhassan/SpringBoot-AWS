package com.learning.springBoot.toDO.controllers;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.learning.springBoot.toDO.entities.Todo;
import com.learning.springBoot.toDO.services.ToDoService;

import jakarta.validation.Valid;



@Controller
//@ResponseBody
@SessionAttributes("name")
public class ToDoController {
	
	ToDoService todoService;
	
	public ToDoController(ToDoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	//list all todo
	@RequestMapping(value = "list-todos", method=RequestMethod.GET)
	public String listTodos(ModelMap model, @SessionAttribute("name") String name) {
		model.put("name", name);
		System.out.println(MessageFormat.format("this is name from list-todo{0}",(String)model.get("name")));
		
		List<Todo> todos = todoService.findByUserName("test");
		model.put("todos", todos);
		return  "listToDos";
	}
	
	
	// add a new todo
	@RequestMapping(value = "add-todo", method=RequestMethod.GET)
	public String showAddTodo(ModelMap model) {
		 model.addAttribute("todo", new Todo(0, (String)model.get("name"), "", null, false));
		return  "addTodo";
	}
	
	// added valid tag for enable the form validation
	// BindinResult is used to get the result status for verifying any errors 
	@RequestMapping(value = "add-todo", method=RequestMethod.POST)
	public String addTodo(@Valid Todo todo, BindingResult result,ModelMap model) {
		System.out.println("checvking for errors");
		System.out.println(result.hasErrors());
		if(result.hasErrors()) {
			model.put("todo", todo);
			System.out.println("inside error loop");
			return "addTodo";
		}else {
			System.out.println("outside error loop");
			todoService.addTodo((String)model.get("name"),todo.getDescription(), todo.getTargetDate(),false);
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
			todo.setUsername((String)model.get("name"));
			todoService.updateTodo(todo);
			return "redirect:list-todos";
		}
	}
	
	
	
}//class end
