package com.gameproject.FirstGame.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1. Launch a spring context 
		
		try(var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfigaration.class);
				){
			//2. Configure the things that we want spring to manage- @Configaration
			
			//HelloWorldConfigaration - @ConfigarationSystem.out.println(context.getBean("Name"));
			
			//name - @Bean
			
			//3. Retrieving Beans managed by Spring
			System.out.println(context.getBean("Name"));
			System.out.println(context.getBean("Age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));
			System.out.println(context.getBean("address2"));
			

			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean(Address.class));
			
			System.out.println(context.getBean("person5QualifierParameters"));
//			Arrays.stream(context.getBeanDefinitionNames())
//				.forEach(System.out::println);
			
		
		}
		
		}

}
