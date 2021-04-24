package com.example.demo.com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsApplication {
		
		public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

		@PostConstruct
		public void intt() {
			logger.info("Application Started ......");
		}
		
		public static void main(String[] args) {
			logger.info("Application executed ......"); 
			SpringApplication.run(SpringJenkinsApplication.class, args);
		}
		
	  
	  @RequestMapping("/getAll")
	  public String test() {
		  System.out.println("Welcome to YouTube...");
		  return "Welcome to YouTube...";
	  }
	
	
	
		
		
		
}
