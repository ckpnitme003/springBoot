package com.nt.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Person_Lob")
@Data
public class PersonInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer pid;
	private String pname;
	private Boolean maritalStatus;
	private LocalDateTime dob;
	
	@Lob
	private byte[] images;
	
	@Lob
	private char[] resumes;
	
	
}
