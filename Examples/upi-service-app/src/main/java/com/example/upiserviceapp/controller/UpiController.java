package com.example.upiserviceapp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/upi")
public class UpiController {

	@Autowired
	private RestTemplate template; // get(url), post(url), put(url) 
	
	@GetMapping
	public Map<String, Double> checkBalance() {
		Map<String, Double> map = new HashMap<String, Double>();
		String url = "http://ACCOUNT-APP/account";
		double balance = template.getForObject(url, Double.class);
		map.put("balance", balance);
		return map;
	}
}
