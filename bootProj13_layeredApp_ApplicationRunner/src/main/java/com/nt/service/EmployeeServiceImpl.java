package com.nt.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bean.Employee;
import com.nt.dao.IEmployeeDao;

@Service("service")
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	private IEmployeeDao dao;
	
	public EmployeeServiceImpl() {
		System.out.println("EmployeeServiceImpl.EmployeeServiceImpl()");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("EmployeeServiceImpl---->init()");
	}
	
	@Override
	public List<Employee> getEmployeeList(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> li=dao.getEmployee(desg1, desg2, desg3);
		return li;
	}
}
