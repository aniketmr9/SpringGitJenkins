package com.test.git.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping("/")
	public String test() {
		logger.info("Test Endpoint");
		return "Hello World";
	}
	
	@GetMapping("/{name}")
	public String test2(@PathVariable(name="name") String name) {
		logger.info("Test2 Endpoint");
		return "Hello "+name;
	}
}
