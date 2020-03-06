package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  // this line is for server and need to be added
public class SpringCloudServer2802Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServer2802Application.class, args);
	}

}
