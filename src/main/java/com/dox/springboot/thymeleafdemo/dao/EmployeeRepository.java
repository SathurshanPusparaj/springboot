package com.dox.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dox.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	//that's it ... no need to write implementation class
	public List<Employee> findAllByOrderByLastNameAsc();
}
