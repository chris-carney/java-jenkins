package com.example.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTests {

	public static final Logger logger = LoggerFactory.getLogger(JenkinsApplication.class);

	
	@Test
	void contextLoads() {
		logger.info("Tests running...");
	}

}
