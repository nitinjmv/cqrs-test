package com.jmv.model;

import javax.persistence.Id;

import lombok.Data;

@Data
public class QueryEmployee {

	@Id
	private int id;
	private int name;
	private int email;
	
}
