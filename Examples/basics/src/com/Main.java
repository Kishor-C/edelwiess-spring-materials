package com;

public class Main {
	public static void main(String[] args) {
		System.out.println("---Main method---");
		Employee emp = new Employee(100, "Alex", 42000);
		
		System.out.println("Id = "+emp.getId());
		System.out.println("Name = "+emp.getName());
		System.out.println("Salary = "+emp.getSalary());
	}
}
