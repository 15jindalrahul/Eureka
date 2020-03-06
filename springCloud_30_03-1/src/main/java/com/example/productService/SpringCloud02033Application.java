package com.example.productService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer         // here we have to write if we r taking admin server 
public class SpringCloud02033Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud02033Application.class, args);
	}

}



//     Admin server is another kind of Eureka server just with good console and detailed link of every instances
// dependcecy to add : Eureka Discovery client ,Spring Boot Admin and rest will be same