package com.nt.service;

import java.util.List;

import com.nt.entity.Student;

public interface IStudentService {
	
	public String registerStud(Student s);
	public List<Student> getAllStud();
	public Student getStud(Integer no);
	public String updateStud(Student s);
	
}
