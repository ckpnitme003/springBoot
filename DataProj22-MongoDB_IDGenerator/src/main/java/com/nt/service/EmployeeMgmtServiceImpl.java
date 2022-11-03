package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.nt.document.Employee;
import com.nt.repository.IEmployeeRepo;

@Service("serviceEmployee")
public class EmployeeMgmtServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeRepo repo;
	
	@Override
	public String register(Employee e) {
		Employee emp=repo.insert(e);
		return "Employee is saved ";
	}

	

}
