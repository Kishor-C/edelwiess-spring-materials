package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BService {

	@Autowired
	private A dao;
	
	public BService() {
		System.out.println("BService is created");
	}
	
	public void demo() {
		dao.test();
		System.out.println("demo() method of service layer");
	}
}
