package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "Person_LOB")
@Data

public class Person {
	@Id
	private String id;
	private String name;
	private byte[] photoContent;
	private char[] resumeContent;
	
}
