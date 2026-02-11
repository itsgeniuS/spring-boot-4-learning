package com.learning.spring_core_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}

}

/**
 *
 * @SpringBootApplication
 * contains
 * - @EnableAutoConfiguration - enables spring boot's auto config support
 * - @ComponentScan - enables component scanning and recursively scans submodules
      - if we have sub packages outside the main - then we have to explicitly mention the submodules path on the spring boot
 		@SpringBootApplication(
			scanBasePackages = { "com.learning.core", ... }
		)
 * - @Configuration - able to register beans with @Bean or import other supported configs
 * and also starts the server by default
 *
* */