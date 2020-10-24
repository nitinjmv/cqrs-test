package com.jmv.service;

import org.springframework.stereotype.Service;

import com.jmv.model.CommandEmployee;
import com.jmv.repository.EmployeeSQLRespository;

@Service
public class CommandService {

	private EmployeeSQLRespository employeeRepository;

	public CommandEmployee create(CommandEmployee employee) {
		return employeeRepository.save(employee);
	}
	
	
}
