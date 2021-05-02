package com.mahfuz.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.mahfuz.main.model.Coder;
import com.mahfuz.mainconfic.BeanConfig;

@SpringBootApplication
//@ImportResource({"classpath:BeanConfig.xml"})
@Import({BeanConfig.class})
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringBootProjectApplication.class, args);
		
//		Coder c1= (Coder) context.getBean("coder1");
//		System.out.println(c1.getName());
//		System.out.println(c1.getLang());
//		System.out.println(c1.getComputer().getBrand());
		
		
//		Coder c2= (Coder) context.getBean("coder2");
//		System.out.println(c2.getName());
//		System.out.println(c2.getLang());
//		System.out.println(c2.getComputer().getBrand());
	}

}
