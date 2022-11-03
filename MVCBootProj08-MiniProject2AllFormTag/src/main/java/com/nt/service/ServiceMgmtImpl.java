package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IStudentDao;
import com.nt.entity.Student;

@Service
public class ServiceMgmtImpl implements IStudentService {
	
	@Autowired
	private IStudentDao repo;
	
	@Override
	public String registerStud(Student s) {
		Student stu=repo.save(s);
		return " student is saved with id :"+stu.getSno();
	}
	@Override
	public List<Student> getAllStud() {
		List<Student> li=(List<Student>)repo.findAll();
		return li;
	}
	@Override
	public Student getStud(Integer no) {
		Student s=repo.findById(no).get();
		return s;
	}
	
	@Override
	public String updateStud(Student s) {
		Student st=repo.save(s);
		return "student is updated with id :"+st.getSno();
	}
}
