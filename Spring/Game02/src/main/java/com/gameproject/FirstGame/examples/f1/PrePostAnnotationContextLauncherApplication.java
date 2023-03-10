package com.gameproject.FirstGame.examples.f1;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	private SomeDependency someDependency;
	public SomeClass(SomeDependency someDependency) {
		super();
		
		this.someDependency = someDependency;
		System.out.println("All Dependency ready");
		
	}
	
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
		
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("Cleanup");
	}
}

@Component
class SomeDependency{
	public void getReady() {
		System.out.println("Some logic");
	}
}


@Configuration
@ComponentScan
public class PrePostAnnotationContextLauncherApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncherApplication.class)) {

			System.out.println("Initialization of context is compleated");

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}

}
