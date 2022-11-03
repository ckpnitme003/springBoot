package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@Data
@ConfigurationProperties(prefix = "org.nit")
public class Employee {
	
	//Simple type
	private Integer eid;
	private String ename;

	//arrays type
	private String[] favColors;
	
	//List type
	private List<String> nickNames;
	
	//Set type
	private Set<Long> phoneNos;
	
	//Map type
	private Map<String,String> idDetails;
	
	//Has-A property
	private Company company;
}
