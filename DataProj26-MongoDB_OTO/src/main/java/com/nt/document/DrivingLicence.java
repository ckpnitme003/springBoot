package com.nt.document;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(collection= "Licence_OTO ")
@Setter
@Getter
@ToString
public class DrivingLicence {
	@Id
	private Integer lid;
	private String licenceType;
	private LocalDateTime expiryDate;
	private Person personDetails;
	
}
