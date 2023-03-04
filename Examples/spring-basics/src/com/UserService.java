package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	//@Qualifier("userDao1")
	private UserDao dao;
	
	public UserService() {
		System.out.println("UserService created");
	}
	public void test() {
		dao.save();
		System.out.println("test() of UserService");
	}
}
