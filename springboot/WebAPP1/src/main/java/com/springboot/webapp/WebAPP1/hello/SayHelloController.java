package com.springboot.webapp.WebAPP1.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	// "say-hello" -> "Hello everyone"
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello everyone";
	}
}
