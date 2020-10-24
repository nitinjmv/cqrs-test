package com.jmv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmv.model.CommandEmployee;

@Repository
public interface EmployeeSQLRespository extends JpaRepository<CommandEmployee, Integer>{
	
}
