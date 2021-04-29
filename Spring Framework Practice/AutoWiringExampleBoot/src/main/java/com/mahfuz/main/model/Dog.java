package com.mahfuz.main.model;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Dog {
	public Dog() {
		System.out.println("Dog Object Created");
	}
	
	public void info() {
		System.out.println("This is a German dog");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Coder Object Destroyed");
	}

}
