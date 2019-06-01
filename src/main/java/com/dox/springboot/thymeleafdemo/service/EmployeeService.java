package com.dox.springboot.thymeleafdemo.service;

import java.util.List;

import com.dox.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeService {
	List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
}
