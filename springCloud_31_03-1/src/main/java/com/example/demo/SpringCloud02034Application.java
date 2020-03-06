package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient         // or we can write @EnableDiscoveryClient(traditional method) ,it is same
public class SpringCloud02034Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud02034Application.class, args);
	}

}


// this is example of FeignServer.
// here we use abstraction thinking,as we dont want to call actual url but will be calling different url but the result would be same
// dependency open Feign to add