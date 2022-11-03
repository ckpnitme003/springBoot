package com.nt.document;


import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Document(collection = "Employee_IDGen")
@Data
public class Employee {
	
	@Id
	private String id;
	
//	@Id
	private Integer eno;
	private String ename;
	private String addr;
	private Double sal;
	private Boolean isVaccinated;
	
	
	
}
