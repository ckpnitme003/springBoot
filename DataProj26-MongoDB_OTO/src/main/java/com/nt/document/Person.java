package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "Person_OTO")
@Setter
@Getter
@ToString
public class Person {
	
	@Id
	private Integer pid;
	private String pname;
	private String paddrs;
	private DrivingLicence liDetails;
}
