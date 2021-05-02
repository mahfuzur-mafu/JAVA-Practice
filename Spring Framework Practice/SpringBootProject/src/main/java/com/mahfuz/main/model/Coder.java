package com.mahfuz.main.model;

import javax.annotation.PreDestroy;

public class Coder {

	private String name;
	private String lang;
	private Computer computer;
	

	public Coder(String name, String lang, Computer computer) {

		super();
		 System.out.println("All -arg Constructor Called (Computer class)");
		this.name = name;
		this.lang = lang;
		this.computer=computer;
		
	}

	public Coder() {
		super();
	  System.out.println("No -arg Constructor Called (Coder class)");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	@PreDestroy
	public void destroy () {
		System.out.println("Coder Object Detroyed");
	}

}
