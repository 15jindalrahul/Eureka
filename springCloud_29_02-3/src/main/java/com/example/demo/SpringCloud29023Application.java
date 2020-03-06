package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy         // this line to be added when routing needs to be done i.e 
                         //when we dont need ports in url on browser,we can just specify application name
                         // and also to add dependenvy Zuul(Maintenamce)
public class SpringCloud29023Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud29023Application.class, args);
	}

}
