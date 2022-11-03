package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Document(collection = "Employee_IDGen")
@Data
public class Employee {
	
	@Id
	private String id;
	private Integer eno;
	private String ename;
	private String addr;
}
