package com.example.accountserviceapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Value("${server.port}")
	private double port;
	
	@GetMapping
	public ResponseEntity<Object> fetchBalance() {
		//double balance = Math.ceil(Math.random() * 999);
		return ResponseEntity.status(200).body(port);
	}
}
