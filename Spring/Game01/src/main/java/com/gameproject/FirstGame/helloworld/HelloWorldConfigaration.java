package com.gameproject.FirstGame.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
	public Person person3Parameters(String Name,int Age, Address address3) {// Name,Age,address2
		return new Person(Name,Age,address3
				);
	}
	
	@Bean
	@Primary
	public Person person4Parameters(String Name,int Age, Address address) {// Name,Age,address2
		return new Person(Name,Age,address
				);
	}
	
	@Bean
	public Person person5QualifierParameters(String Name,int Age, @Qualifier("address3qualifier") Address address) {// Name,Age,address2
		return new Person(Name,Age,address
				);
	}
	
	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("N.S Road","Mankundu");
	}
	
	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("Palpara","Mankundu");
	}
}
