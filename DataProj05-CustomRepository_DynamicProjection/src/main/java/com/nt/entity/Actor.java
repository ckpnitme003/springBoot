package com.nt.entity;

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
@Table(name = "DataJPA_Actor")
@Data
@RequiredArgsConstructor
//@NoArgsConstructor
@AllArgsConstructor
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer aid;
	@NonNull
	private String aname;
	@NonNull
	private String category;
	@NonNull
	private Long mobile;
	
	public Actor() {
		System.out.println("0 param constructor -"+this.getClass());
	}
}
