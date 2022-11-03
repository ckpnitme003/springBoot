package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "DataJPA_Actor_Gen")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Actor {
	@Id
	@GenericGenerator(name = "gen1", strategy = "com.nt.customgenerator.SequenceIdGenerator")
	@GeneratedValue(generator = "gen1")  
	private String aid;
	@NonNull
	private String aname;
	@NonNull
	private String category;
	@NonNull
	private Long mobile;
}
