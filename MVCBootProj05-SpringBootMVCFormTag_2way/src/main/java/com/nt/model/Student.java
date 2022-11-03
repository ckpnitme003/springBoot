package com.nt.model;

import lombok.Data;

@Data
public class Student {
	private Integer sno;
	private String sname;
	private String sadd;
	private Float avg;
	
	/*public Student() {
		this.sno=101;
		this.sname="hk";
		this.sadd="hyd";
		this.avg=88.9f;
	}*/
	public Student() {
		System.out.println("Student NPC");
	}
	public Student(Integer sno,String sname,String sadd,Float avg) {
		System.out.println("Student all arg constructor");
		this.sno=sno;
		this.sname=sname;
		this.sadd=sadd;
		this.avg=avg;
	}
}
