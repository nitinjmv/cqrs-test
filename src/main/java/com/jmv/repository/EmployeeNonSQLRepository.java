package com.jmv.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jmv.model.QueryEmployee;

public interface EmployeeNonSQLRepository extends MongoRepository<QueryEmployee, Integer>{

}
