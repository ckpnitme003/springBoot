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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Doctor_MTM")
@Setter
@Getter
@ToString
public class Doctor {
	@Id
	@SequenceGenerator(sequenceName = "sqq1",allocationSize = 1,initialValue = 100,name = "gen1")
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer did;
	private String dname;
	private String hospital;
	
//	@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "per")
////	@JoinColumn(name = "Person_ID",referencedColumnName = "pid")
	
	@ManyToMany(targetEntity = Patient.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name = "DOC_PAT_ID_DETAILS",joinColumns = @JoinColumn(name  = "DOC_ID"
				,referencedColumnName = "did"),
				inverseJoinColumns = @JoinColumn( name = "PAT_ID"
				,referencedColumnName = "pid"))
	private Set<Patient> pat;
}
