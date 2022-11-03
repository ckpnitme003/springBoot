package com.nt.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "person_OTO")
@Setter
@Getter
@ToString

public class Person {
	@Id
	@SequenceGenerator(sequenceName = "sqq1",allocationSize = 1,initialValue = 100,name = "gen1")
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer pid;
	private String pname;
	
//	@OneToOne(targetEntity = PassportDetails.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//	@JoinColumn(name ="Per_Id",referencedColumnName = "pid")
//	private PassportDetails idDetails;
	

	
	
	
}
