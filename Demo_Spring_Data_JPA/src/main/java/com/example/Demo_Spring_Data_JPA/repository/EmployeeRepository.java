package com.example.Demo_Spring_Data_JPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo_Spring_Data_JPA.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	@Query(value = "SELECT * FROM employee_db e WHERE e.last_name = 1", nativeQuery = true)
	List<Employee> findEmployeeByName(String lastname);
	
}
