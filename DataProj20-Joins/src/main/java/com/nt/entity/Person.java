package com.nt.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Person_OTM")
@Setter
@Getter
//@ToString

public class Person {
	@Id
	@SequenceGenerator(sequenceName = "sqq1",allocationSize = 1,initialValue = 100,name = "gen1")
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer pid;
	private String pname;
	
	@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "per")
//	@JoinColumn(name = "Person_ID",referencedColumnName = "pid")
	private Set<PhoneNumber> phones;

	public Person() {
		System.out.println("NPC :"+this.getClass());
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + "]";
	}
	
	
	
}
