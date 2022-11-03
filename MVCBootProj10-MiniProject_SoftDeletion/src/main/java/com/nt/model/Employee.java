package com.nt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.Data;

@Data
@Entity
@Table(name = "boot_emp")
@SQLDelete(sql = "update boot_emp set status='Inactive' where eno=?")
@Where(clause = "status <> 'Inactive'")
public class Employee {
	
	@Id
	@SequenceGenerator(name = "gen1",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer eno;
	private String ename;
	private String eaddr;
	private String job;
	private Double sal;
	private String status;
}
