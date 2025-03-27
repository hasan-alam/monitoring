package com.hasan.gwswerver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GwswerverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GwswerverApplication.class, args);
	}

}
