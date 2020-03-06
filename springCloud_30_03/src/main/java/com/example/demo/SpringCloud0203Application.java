package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloud0203Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud0203Application.class, args);
	}

}
                 // this for Eureka server