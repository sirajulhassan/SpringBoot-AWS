package com.learning.springBoot.toDO.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.springBoot.toDO.entities.Todo;

//1>>here JPA repo need first parameter as which entity, and second one is the id type(wrapper class)
public interface TodoRepo extends JpaRepository<Todo, Integer>{

	//2>> defining getbyuserName 
	public List<Todo> findByUserName(String userName);
}
