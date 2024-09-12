package com.learning.springBoot.toDO.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.learning.springBoot.toDO.services.LoginService;
import com.learning.springBoot.toDO.services.ToDoService;

import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@SessionAttributes("name")

public class LoginController {
	
	LoginService loginService;
	
	
	
	public LoginController(LoginService loginService) {
		super();
		this.loginService = loginService;
		System.out.println("login controller");
	}

	@RequestMapping(value ="login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping("test")
	public String test() {
		return "login";
	}
	
	
	
	//for the form from login(post)
		@RequestMapping(value ="login", method = RequestMethod.POST)
		public String auth(@RequestParam String name,@RequestParam String password, ModelMap model ) {
			
			if(loginService.validateUser(name, password)) {
				model.put("name", name);
				return "welcome";
			}
			else {
				model.put("errorMsg", "invalid user");
				return "login";
			}
		}
	
	
	
}
