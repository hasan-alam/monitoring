package com.hasan.gwserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;

import java.time.Duration;
import java.time.LocalDateTime;

@SpringBootApplication
@EnableDiscoveryClient
public class GwswerverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GwswerverApplication.class, args);
	}

	@Bean
	public RouteLocator monitoringRouteConfig(RouteLocatorBuilder routeLocatorBuilder) {
		return routeLocatorBuilder.routes()
				.route(p -> p
						.path("/monitoring/course/**")
						.filters( f -> f.rewritePath("/monitoring/course/(?<segment>.*)","/${segment}")
								.addResponseHeader("X-Response-Time", LocalDateTime.now().toString())
								.circuitBreaker(config -> config.setName("courseCB")
										.setFallbackUri("forward:/fallback/course")))
						.uri("lb://COURSE-SERVICE"))
				.route(p -> p
						.path("/monitoring/student/**")
						.filters( f -> f.rewritePath("/monitoring/student/(?<segment>.*)","/${segment}")
								.addResponseHeader("X-Response-Time", LocalDateTime.now().toString())
								.circuitBreaker(config -> config.setName("studentCB")
										.setFallbackUri("forward:/fallback/student")))
						.uri("lb://STUDENT-SERVICE"))
				.build();
	}

}
