package com.gameproject.FirstGame;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfigaration {
	
	@Bean
	public String Name() {
		return "Debadyuti";
		
	}

}
