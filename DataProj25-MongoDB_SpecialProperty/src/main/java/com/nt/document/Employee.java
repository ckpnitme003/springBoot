package com.nt.document;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "Employee_Special")
@Data
public class Employee {
	
	@Id
	private String id;
	
	private Integer eno;
	private String ename;
	private String[] nicknames;
	private List<String> friends;
	private Set<Long> phoneNo;
	private Map<String,String> dept;
	private Properties idDetails;
	

}
