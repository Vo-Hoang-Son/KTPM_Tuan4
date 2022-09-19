package com.example.Demo_Spring_Data_JPA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.Demo_Spring_Data_JPA.entity.Employee;
import com.example.Demo_Spring_Data_JPA.repository.EmployeeRepository;

public class EmployeeServiceImpl {

	private EmployeeRepository employeeRepository;

    @Autowired
    public void setEmployeeRepository(EmployeeRepository repository){
        this.employeeRepository = repository;
    }

    @Transactional
    public void addClient(Employee employee){
        employeeRepository.save(employee);
    }
	
}
