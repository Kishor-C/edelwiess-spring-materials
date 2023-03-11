package com.example.springbootdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springbootdemo.beans.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	//JpaRepository - save(T), findById(ID), findAll: List<T>
	// EmployeeRepository - save(Employee), findById(Integer), findAll: List<Employee>
	
	// we can create custom methods with @Query for retrieving, @Modify for modifying
	@Query("select e from Employee e where e.name = ?1")
	public List<Employee> findEmployeesByName(String name);
}
