package com.mine.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {

	@GetMapping("/msg")
	public String sayMsg() {
		return "Welcome to Azure!!";
	}
		
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}

}
