package com.example.demo;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmsApplication {
	
	private static final Logger logger = LogManager.getLogger(EmsApplication.class);

	public static void main(String[] args) {
		logger.info("In Main Class");
		SpringApplication.run(EmsApplication.class, args);
	}

}
