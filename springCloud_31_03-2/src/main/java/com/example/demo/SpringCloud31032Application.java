package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients     // here dependency to add openFeign and write this line
public class SpringCloud31032Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud31032Application.class, args);
	}

}
