package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Employee_Inheriatnce")
@Setter
@Getter
@ToString
@PrimaryKeyJoinColumn(name = "per_ID",referencedColumnName = "pid")
public class Employee extends Person {
	
	
	private String companyName;
	private Double sal;
	private String desg;

	
}
