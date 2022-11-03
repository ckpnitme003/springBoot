package com.nt.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Patient_MTM")
@Setter
@Getter
@ToString
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer pid;
	
	private String patName;
	private String problem;
	
	@ManyToMany(targetEntity = Doctor.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name = "DOC_PAT_ID_DETAILS",joinColumns = @JoinColumn(name  = "PAT_ID",referencedColumnName = "pid"),
										inverseJoinColumns = @JoinColumn( name = "DOC_ID",referencedColumnName = "did"))
	private Set<Doctor> doc;
}
