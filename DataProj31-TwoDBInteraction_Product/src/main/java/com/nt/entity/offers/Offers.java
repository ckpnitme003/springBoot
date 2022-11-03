package com.nt.entity.offers;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Offers_MDS")
@Data
public class Offers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer oid;
	
	private String oname;
	private Double discount;
	private LocalDate valid;
	
	public Offers() {
		System.out.println("Offers-NPC");
	}
	public Offers(String oname, Double discount, LocalDate valid) {
		this.oname = oname;
		this.discount = discount;
		this.valid = valid;
	}
	
	
}
