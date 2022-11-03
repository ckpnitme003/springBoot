package com.nt.entity.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Product_MDS")
@Data

public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer pid;
	private String pname;
	private Double price;
	private Double qty;
	
	public Product() {
		System.out.println("product -NPC");
	}
	public Product(String pname, Double price, Double qty) {
		this.pname = pname;
		this.price = price;
		this.qty = qty;
	}

	
}
