package com.mahfuz.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mahfuz.main.model.Coder;

@SpringBootApplication
public class AutoWiringExampleBootApplication {

	public static void main(String[] args) {
//		SpringApplication.run(AutoWiringExampleBootApplication.class, args);
		ApplicationContext context = SpringApplication.run(AutoWiringExampleBootApplication.class,args);
		Coder c1 = context.getBean(Coder.class);
		//c1.petInfo();
		c1.name="Adam";
		System.out.println(c1.name);
		
		Coder c2 = context.getBean(Coder.class);
		//c1.petInfo();

		System.out.println(c2.name);
	}

}
