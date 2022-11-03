package com.nt.entity.icici;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="ICICI_Bank")
@Data

public class ICICIBank {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accId;
	
	private String accHolderName;
	private Double balance;
	private String ifsc;
	
	public ICICIBank() {
		System.out.println("ICICI bank-NPC");
	}
	public ICICIBank(String accHolderName, Double balance, String ifsc) {
		this.accHolderName = accHolderName;
		this.balance = balance;
		this.ifsc = ifsc;
	}
	
	
}
