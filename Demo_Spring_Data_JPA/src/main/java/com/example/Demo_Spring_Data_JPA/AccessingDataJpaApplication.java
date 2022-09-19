package com.example.Demo_Spring_Data_JPA;

import org.aspectj.weaver.patterns.ArgsAnnotationPointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import lombok.Builder;

import com.example.Demo_Spring_Data_JPA.entity.Employee;
import com.example.Demo_Spring_Data_JPA.repository.EmployeeRepository;

@ComponentScan(basePackages = {"com.example.Demo_Spring_Data_JPA.service"})
@SpringBootApplication
public class AccessingDataJpaApplication {

	private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(AccessingDataJpaApplication.class, args);

	}
	
	private void insertFourEmployees(EmployeeRepository repository) {
		Employee employee = Employee.builder();
		employee.setFirstname("Vo");
		employee.setLastName("Son");
		employee.setEmail("vhs@email.com");
		repository.save(employee);
	
	}
	
	@Bean
	public CommandLineRunner run(EmployeeRepository repository) {
		return (args -> {
			insertFourEmployees(repository);
			System.out.println(repository.findAll());
		});
	}
	
}
