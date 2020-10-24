package com.jmv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmv.model.CommandEmployee;
import com.jmv.model.QueryEmployee;
import com.jmv.repository.EmployeeNonSQLRepository;

@Service
public class QueryService {

	@Autowired
	private EmployeeNonSQLRepository employeeNonSQLRepository;

	public List<QueryEmployee> retrieveAll() {
		return null;
	}

	public QueryEmployee retrieveById(Integer id) {
		return null;
	}
	
	
}
