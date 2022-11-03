package com.nt.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "dept_mvc")
public class Department {

	@Id
	private Integer deptNo=10;
	private String dName;
}
