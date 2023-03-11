package com.example.springbootdemo.service;

import java.util.List;

import com.example.springbootdemo.beans.Employee;
import com.example.springbootdemo.exception.EmployeeNotFoundException;

public interface EmployeeService {
	// saves employee and returns the saved employee 
	public Employee save(Employee employee);
	// return all the employees
	public List<Employee> fetchEmployees();
	// return employee based on id or throw EmployeeNotFoundException
	public Employee fetchEmployee(int id) throws EmployeeNotFoundException;
	// return all the employees whose name is same
	public List<Employee> fetchEmployeesByName(String name);
}
