package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@Data
//@ConfigurationProperties(prefix = "org.nit")
public class Employee {
		
		//Simple type
		@Value("${org.nit.eid}")
		private Integer eid;
		@Value("${org.nit.ename}")
		private String ename;
	
		//arrays type
		@Value("${org.nit.favColors}")
		private String[] favColors;
	
		//List type
		@Value("${org.nit.nickNames}")
		private List<String> nickNames;
		
		//Set type
		@Value("${org.nit.phoneNos}")
		private Set<Long> phoneNos;
			
		/*	//Map type
			@Value("${org.nit.idDetails}")
			private Map<String,String> idDetails;
			
		//Has-A property
		@Value("${org.nit.company}")
		private Company company; */

		//for Map and Hash-A is problem is there		
}
