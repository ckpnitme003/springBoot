package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Customer_Inheriatnce")
@Setter
@Getter
@ToString
@PrimaryKeyJoinColumn(name = "Per_ID",referencedColumnName = "pid")
public class Customer extends Person {
	
	private Integer billNo;
	private Double billAmt;

	
}
