package com.nt.document;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(collection= "Phone_OTM ")
@Setter
@Getter
@ToString
public class PhoneNumber {
	@Id
	private Integer phid;
	private String numberType;
	private Long phno;
	private Person personDetails;
	
}
