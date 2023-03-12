package com.example.servicediscoveryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
// run service discovery in 8761 
// Eureka Server gives you a dashboard to see all the registered services
public class ServiceDiscoveryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryAppApplication.class, args);
	}

}
