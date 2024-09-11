package com.learning.springBoot.toDO.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validateUser(String userName, String password){
		if (userName != null && userName.equals("siraj") && password != null && password.equals("test")) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
