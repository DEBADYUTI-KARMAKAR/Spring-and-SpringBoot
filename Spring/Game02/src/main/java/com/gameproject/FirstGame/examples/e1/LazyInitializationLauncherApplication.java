package com.gameproject.FirstGame.examples.e1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
class ClassA{
	
}
@Component
@Lazy
class ClassB{
	private ClassA classA;
	public ClassB(ClassA classA) {
		System.out.println("Some Initialization logic");
		this.classA = classA;
		
	}
	
	public void doSomething() {
		System.out.println("Do something");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {
			
			System.out.println("Initialization of context is compleated");
			
			context.getBean(ClassB.class).doSomething();
//			Arrays.stream(context.getBeanDefinitionNames())
//			.forEach(System.out::println);
		}
	}

}
