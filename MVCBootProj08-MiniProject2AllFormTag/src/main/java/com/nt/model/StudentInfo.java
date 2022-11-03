package com.nt.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class StudentInfo {

	private Integer sno;
	private String sname;
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	private String pwd;
	private Boolean ms;
	
	
	private String[] hobbies;
	
	
	private List<String> lang;
	private String gender;
	private String education;
	private String notes;
	
	
	private MultipartFile photo;
	
	private MultipartFile resume;
}
