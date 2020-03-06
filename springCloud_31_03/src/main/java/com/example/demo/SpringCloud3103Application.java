package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloud3103Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud3103Application.class, args);
	}

}
