package com.example.springbootdemo.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdemo.beans.Employee;
import com.example.springbootdemo.exception.EmployeeNotFoundException;
import com.example.springbootdemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	@PostMapping(path = "/employee", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> createEmployee(@RequestBody Employee employee) {
		Employee emp = service.save(employee);
		return ResponseEntity.status(200).body(emp);
	}
	@GetMapping(path = "/employee")
	public ResponseEntity<Object> getEmployee() {
		return ResponseEntity.status(200).body(service.fetchEmployees());
	}
	@GetMapping(path = "/employee/{id}")
	public ResponseEntity<Object> getEmployeeById(@PathVariable("id") int id) {
		try {
			Employee employee = service.fetchEmployee(id);
			return ResponseEntity.status(200).body(employee);
		} catch(EmployeeNotFoundException ex) {
			String message = ex.getMessage();
			return ResponseEntity.status(404).body(message); // you can
		}
	}
	@GetMapping(path = "/employee/name/{name}")
	public ResponseEntity<Object> getEmployeesByName(@PathVariable("name") String name) {
		return ResponseEntity.status(200).body(service.fetchEmployeesByName(name));
	}
}
