package com.nt.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Person_Inheritance")
@Setter
@Getter
@ToString
@Inheritance(strategy = InheritanceType.JOINED)

public class Person {
	@Id
	@SequenceGenerator(sequenceName = "sqq1",allocationSize = 1,initialValue = 100,name = "gen1")
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer pid;
	private String pname;
	
	
}
