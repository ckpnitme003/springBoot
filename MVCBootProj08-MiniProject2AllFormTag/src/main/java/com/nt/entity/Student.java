package com.nt.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.annotations.ListIndexBase;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name="Student_mvc_allform")
@Data
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer sno;
	private String sname;
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	private String pwd;
	private Boolean ms;
	
	@ElementCollection
	@CollectionTable(name="hobbies_mvc_allform",joinColumns = @JoinColumn(columnDefinition ="sid",referencedColumnName = "sno" ))
	@OrderColumn(name = "hobbies_index")
	@ListIndexBase(1)
	private String[] hobbies;
	
	@ElementCollection
	@CollectionTable(name = "Language_mvc_allform",joinColumns = @JoinColumn(columnDefinition = "sid",referencedColumnName = "sno"))
	private List<String> lang;
	
	private String gender;
	private String education;
	private String notes;
	
	
	private String photoPath;
	
	private String resumePath;
	


}
