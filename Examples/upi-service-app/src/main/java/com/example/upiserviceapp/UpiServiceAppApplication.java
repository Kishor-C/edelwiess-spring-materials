package com.example.upiserviceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient // automatically registers in service discovery by looking it in 8761
public class UpiServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpiServiceAppApplication.class, args);
	}
	
	@LoadBalanced // we will be using service-id not the ip & port
	@Bean
	public RestTemplate template(RestTemplateBuilder builder) {
		return builder.build();
	}

}
