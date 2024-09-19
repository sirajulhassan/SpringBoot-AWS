package com.learning.springBoot.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {
//	normally we use LDAP or DATAbase
//	but now we are using inMemory
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		
		Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);
		UserDetails userDetails = User.builder()
								.passwordEncoder(passwordEncoder).username("admin").password("admin").roles("admin","ADMIN").build();
		
		return new InMemoryUserDetailsManager(userDetails);
	}
	
	// custom password encorder using Bcrypt
			@Bean
			public PasswordEncoder passwordEncoder() {
				return new BCryptPasswordEncoder();
			}
}
