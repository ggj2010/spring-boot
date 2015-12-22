package com.ggj.springboot.firstdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot! 这个是用IntelliJ IDEA15.0.2开发";
	}
	
}
