package com.mahfuz.main.model;

import javax.annotation.PreDestroy;

public class Computer {

	private String brand;

	public Computer(String brand) {
		super();
		 System.out.println("All -arg Constructor Called (Computer class)");
		this.brand = brand;
	}

	public Computer() {
		super();
		 System.out.println("No -arg Constructor Called (Computer class)");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@PreDestroy
	public void destroy () {
		System.out.println("Computer Object Detroyed");
	}
}
