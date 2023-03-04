package com;

import org.springframework.stereotype.Repository;

@Repository // spring creates this object and its id will be same as the class-name, but first-letter will be lower case
public class A {

	// auto-wire the datasource here & in test method call the getUrl() and check spring container
	// is injecting the object
	
	public A() {
		System.out.println("object of A is created");
	}
	public void test() {
		System.out.println("test() inside class A");
	}
}
