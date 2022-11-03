package com.nt.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Customer {
	
	private String cname;
	private Date dob;
	private Date dop=new Date();
	private Boolean isMember;
//	@DateTimeFormat(pattern = "dd-MM-yyyy")//Exception
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate doj;
	
}
