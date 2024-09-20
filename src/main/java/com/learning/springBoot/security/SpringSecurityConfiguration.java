package com.learning.springBoot.security;

import static org.springframework.security.config.Customizer.withDefaults;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class SpringSecurityConfiguration {
//	normally we use LDAP or DATAbase
//	but now we are using inMemory
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		UserDetails adminUser = createUser("admin", "admin");
		UserDetails testUser = createUser("tester", "tester");
		return new InMemoryUserDetailsManager(adminUser,testUser);
	}

	private UserDetails createUser(String username, String password) {
		Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);
		UserDetails userDetails = User.builder()
				.passwordEncoder(passwordEncoder)
				.username(username).password(password)
				.roles(password, "ADMIN").build();
		return userDetails;
	}
	
	// custom password encorder using Bcrypt
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	
	//updating SecurityfilterChain for H2 console page loading error(it is using html frames and spring security is by default disable it)
	//to do that we need to override filter chain and manuelly add the default chains and disable csrf and frames
	
	//configure below things in custom filter
	// 1.default chain -all URLs are protected
	// 2.default chain adding default chain - redirect to default login page for un autorized requests.
	
	//3.cusomize - disable csrf
	//4.customize- enable frames
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http ) throws Exception{
		// adding default chain - to protect all requests
		http.authorizeHttpRequests(auth->auth.anyRequest().authenticated());
		
		// adding default chain - redirect to default login page for un autorized requests
		http.formLogin(withDefaults());
		
		//disable csrf
		http.csrf().disable();
		
		//disable blocking frames
		http.headers().frameOptions().disable();
		
		return http.build();
	}
	
	
	
	
	
}
