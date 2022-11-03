package com.nt.entity.sbi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="SBI_Bank")
@Data

public class SBIBank {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accId;
	
	private String accHolderName;
	private Double balance;
	private String ifsc;
	
	
	public SBIBank() {
		System.out.println("SBI bank -NPC");
	}
	public SBIBank(String accHolderName, Double balance, String ifsc) {
		this.accHolderName = accHolderName;
		this.balance = balance;
		this.ifsc = ifsc;
	}
	
	
}
