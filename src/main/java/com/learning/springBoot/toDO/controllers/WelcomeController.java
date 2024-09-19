package com.learning.springBoot.toDO.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.learning.springBoot.toDO.services.LoginService;



@Controller
@SessionAttributes("name")
public class WelcomeController {
	
	@RequestMapping(value ="/", method = RequestMethod.GET)
	public String gotoWelcomePage(ModelMap model) {
		System.out.println("Welecome controller: " +getLoggedUser());
		model.put("name", getLoggedUser());
		return "welcome";
	}
	
	private String getLoggedUser() {
		 return SecurityContextHolder.getContext().getAuthentication().getName();
	}
	
	
	//going to use spring security - no need of the login logic, login.jsp and login.controller
	
	/*
	 * 
	 * LoginService loginService;
	 * 
	 * 
	 * 
	 * public LoginController(LoginService loginService) { super();
	 * this.loginService = loginService; System.out.println("login controller"); }
	 * 
	 * @RequestMapping(value ="login", method = RequestMethod.GET) public String
	 * login() { return "login"; }
	 * 
	 * //for the form from login(post)
	 * 
	 * @RequestMapping(value ="login", method = RequestMethod.POST) public String
	 * auth(@RequestParam String name,@RequestParam String password, ModelMap model
	 * ) {
	 * 
	 * if(loginService.validateUser(name, password)) { model.put("name", name);
	 * return "welcome"; } else { model.put("errorMsg", "invalid user"); return
	 * "login"; } }
	 * 
	 * 
	 */
}
