package com.springboot.webapp.WebAPP1.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("login")
	public String Login(@RequestParam String name) {
		return "logedin";
	}
	
}
