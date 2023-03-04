package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// load the spring container 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = (UserService)ctx.getBean("userService");
		System.out.println("__________Verifying AOP From Here____________");
		service.test();
	}

}
