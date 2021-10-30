package com.example.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		Logger logger = LoggerFactory.getLogger(HelloController.class);
		logger.info("home controller started...");
		return "Greetings from Spring Boot with Github Actions with removed azure maven plugin!";
	}

}
