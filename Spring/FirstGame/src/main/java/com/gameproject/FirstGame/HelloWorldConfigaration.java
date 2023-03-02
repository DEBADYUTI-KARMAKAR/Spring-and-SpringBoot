package com.gameproject.FirstGame;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {};

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
		return new Person("Ram",20, new Address("Pipulpathi","Hooghly"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(Name(),Age(),address());
	}
	
	@Bean
	public Person person3Parameters(String Name,int Age, Address address2) {// Name,Age,address2
		return new Person(Name,Age,address2
				);
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("N.S Road","Mankundu");
	}
}
