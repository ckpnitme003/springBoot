package com.nt.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="PhoneNumber_OTM")
@Setter
@Getter
//@ToString

public class PhoneNumber {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer regNo;
	
	private String numberType;
	private Long mobile;
	
	@ManyToOne(targetEntity = Person.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "Person_ID",referencedColumnName = "pid")
	private Person per;

	public PhoneNumber() {
		System.out.println("NPC :"+this.getClass());
	}
	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", numberType=" + numberType + ", mobile=" + mobile + "]";
	}
	
	
	
}
