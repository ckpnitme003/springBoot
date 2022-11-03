package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class PersonInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer pid;
	private String pname;
	private Float page;
	private LocalDate dob;
	private LocalTime tob;
	private LocalDateTime doj;
	
}
