package com.learning.springBoot.toDO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
//@ResponseBody
public class toDoController {
	
	@GetMapping("hello")
	public String hello() {
		return "sayHello";
	}
	
	@GetMapping("welcome")
	public String loggin() {
		
		return "welcome";
	}
	
	@RequestMapping("login")
	public String login() {
		return "login";
	}
	
	
	
}
