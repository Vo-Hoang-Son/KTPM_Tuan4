package com.example.Demo_Spring_Data_JPA.service;

import java.util.List;

import com.example.Demo_Spring_Data_JPA.entity.Employee;

public interface EmployeeService {

	List<Employee> findEmployeeByName(String lastname);
	
}
