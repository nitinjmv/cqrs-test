package com.jmv.service;

import org.springframework.stereotype.Service;

import com.jmv.model.Employee;
import com.jmv.repository.EmployeeRespository;

@Service
public class CommandService {

	private EmployeeRespository employeeRepository;

	public Employee create(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	
}
