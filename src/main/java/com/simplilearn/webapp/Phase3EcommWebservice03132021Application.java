package com.simplilearn.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Phase3EcommWebservice03132021Application {

	public static void main(String[] args) {
		SpringApplication.run(Phase3EcommWebservice03132021Application.class, args);
	}

}


// @SpringBootApplication : enable spring boot application configuration
/// 1) @SpringBootConfiguration + 2) @EnableAutoConfiguration 3) @ComponentScan

//1) @SpringBootConfiguration : enable java based configurations ( favor java based configuration over xml configuration)
//2) @EnableAutoConfiguration : enable spring boot configurations
//3) @ComponentScan : enable component scan