package com.mahfuz.main.model;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Coder {
	public String name;
	
	@Autowired
	Dog dog;
	public Coder()
	{
	 System.out.println("Coder Object Created");
	}
	public void petInfo() {
		dog.info();
		
		
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Coder Object Destroyed");
	}
}
