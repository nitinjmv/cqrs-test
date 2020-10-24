package com.jmv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmv.model.CommandEmployee;
import com.jmv.service.CommandService;

@RestController
@RequestMapping("api/v1/employees")
public class CommandController {
	
	@Autowired
	private CommandService commandService;

	@PostMapping
	public ResponseEntity<CommandEmployee> create(@RequestBody CommandEmployee employee) {
		return new ResponseEntity<>(commandService.create(employee), HttpStatus.CREATED);
	}
}
