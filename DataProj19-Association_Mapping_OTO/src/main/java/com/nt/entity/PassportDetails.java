package com.nt.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Passport_OTO")
@Setter
@Getter
@ToString
public class PassportDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer passId;
	private Integer passportNumber;
	private String country;
	
	@OneToOne(targetEntity = Person.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name ="Per_Id",referencedColumnName = "pid")
	private Person per;


	
}
