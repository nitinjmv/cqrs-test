package com.jmv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmv.model.Employee;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Integer>{
	
}
