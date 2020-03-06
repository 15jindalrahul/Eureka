package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class SpringCloud02031Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud02031Application.class, args);
	}

}
//EnableEurekaClient
//EnableFeignClient