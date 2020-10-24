package com.jmv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmv.model.QueryEmployee;
import com.jmv.service.QueryService;

@RestController
@RequestMapping("api/v1/employees")
public class QueryController {

	@Autowired
	private QueryService queryService;
	
	@GetMapping
	public ResponseEntity<List<QueryEmployee>> retrieveAll(){
		
		return new ResponseEntity<List<QueryEmployee>>(queryService.retrieveAll(), HttpStatus.OK);
	}
	
	@GetMapping("id/{id}")
	public ResponseEntity<QueryEmployee> retrieveById(@PathVariable Integer id){
		
		return new ResponseEntity<QueryEmployee>(queryService.retrieveById(id), HttpStatus.OK);
	}
	
	
}
