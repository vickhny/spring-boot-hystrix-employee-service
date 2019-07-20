package com.example.springboothystrixdeptservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
public class SpringBootHystrixDeptServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHystrixDeptServiceApplication.class, args);
	}

}
