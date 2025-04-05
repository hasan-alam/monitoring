package com.hasan.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CourseMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseMsApplication.class, args);
	}

}
