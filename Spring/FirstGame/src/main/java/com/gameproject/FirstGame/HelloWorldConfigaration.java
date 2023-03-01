package com.gameproject.FirstGame;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};

record Address(String firstline, String city) {};

@Configuration
public class HelloWorldConfigaration {
	
	@Bean
	public String Name() {
		return "Debadyuti";
		
	}
	
	@Bean
	public int Age() {
		return 22;
	}
	
	@Bean
	public Person person() {
		return new Person("Ram",20);
	}
	
	@Bean
	public Address address() {
		return new Address("N.S Road","Mankundu");
	}
}
