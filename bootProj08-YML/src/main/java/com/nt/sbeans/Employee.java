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
	private String eaddrs;
}
