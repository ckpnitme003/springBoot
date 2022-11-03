package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "DATAACCOUNT")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class BankAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ACCNO")
	private Long accNo;
	
	@Column(name = "NAME")
	@NonNull
	private String name;
	
	@Column(name = "BALANCE")
	@NonNull
	private Double balance;
	
	
}
