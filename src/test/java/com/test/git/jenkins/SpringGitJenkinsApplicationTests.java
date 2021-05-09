package com.test.git.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringGitJenkinsApplicationTests {

	Logger logger = LoggerFactory.getLogger(SpringGitJenkinsApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Test executed");
		assertEquals(true, true);
	}
	
	@Test
	void contextLoads() {
		logger.info("Test executed 2");
		assertEquals(true, true);
	}

}
