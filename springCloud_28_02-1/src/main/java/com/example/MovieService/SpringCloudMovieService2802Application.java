package com.example.MovieService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient  // for every client this annotations need to be addded
public class SpringCloudMovieService2802Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMovieService2802Application.class, args);
	}

}
