package com.hasan.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableFeignClients
@EnableAutoConfiguration
//@EnableDiscoveryClient
public class StudentMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentMsApplication.class, args);
	}

}
