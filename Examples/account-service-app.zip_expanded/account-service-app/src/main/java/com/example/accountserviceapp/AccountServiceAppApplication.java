package com.example.accountserviceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // automatically registers in service discovery by looking it in 8761
public class AccountServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceAppApplication.class, args);
	}

}
