package com.example.springbootdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootdemo.beans.Employee;
import com.example.springbootdemo.dao.EmployeeRepository;
import com.example.springbootdemo.exception.EmployeeNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository dao;
	@Override
	public Employee save(Employee employee) {
		Employee e = dao.save(employee); 
		return e; 
	}
	@Override
	public List<Employee> fetchEmployees() {
		return dao.findAll();
	}
	@Override
	public Employee fetchEmployee(int id) throws EmployeeNotFoundException {
		Employee emp = dao.findById(id).orElse(null); // returns employee or null
		if(emp == null) throw new EmployeeNotFoundException("Sorry employee "+id+" not found");
		return emp;
	}
	@Override
	public List<Employee> fetchEmployeesByName(String name) {
		return dao.findEmployeesByName(name);
	}
}
