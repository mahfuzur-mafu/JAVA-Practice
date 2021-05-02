package com.mahfuz.mainconfic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mahfuz.main.model.Coder;
import com.mahfuz.main.model.Computer;

@Configuration

public class BeanConfig {
	@Bean
	public Coder coder1(@Qualifier("computer1")Computer computer) {
		Coder c1 = new Coder("Mahfuz","Java",computer);
//		c1.setName("Mr Adam");
//		c1.setLang("Phyton");
//		c1.setComputer(computer);
		return c1;
		
		
	}
	@Bean
	public Computer computer1() {
		Computer com1= new Computer("Intel");
//		com1.setBrand("intel");
		
		return com1;
		
		
	}
	
	
	@Bean
	public Coder coder2(@Qualifier("computer2") Computer computer) {
		Coder c2 = new Coder();
		c2.setName("Eva");
		c2.setLang("Cpp");
		c2.setComputer(computer);
		return c2;
		
		
	}
	@Bean
	public Computer computer2() {
		Computer com2= new Computer();
		com2.setBrand("Dell");
		
		return com2;
		
		
	}

}
