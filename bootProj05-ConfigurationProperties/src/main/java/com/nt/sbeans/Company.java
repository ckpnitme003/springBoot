package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("comp")
@ConfigurationProperties(prefix = "org.nit")
@Setter
@ToString
//@PropertySource("app.properties")
public class Company {
	
	private String name;
	private String addrs;
	@Value("${org.nit.pincode1}")
	private Long pincode;
	@Value("${nit.phone}")
	private Long contactno;
	
	@Value("${nit.size}")
	private Integer size;
	
}
