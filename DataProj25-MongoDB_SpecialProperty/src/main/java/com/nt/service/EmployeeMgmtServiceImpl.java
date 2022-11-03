package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
		return "Employee is saved with Id value ="+emp.getId();
	}
	@Override
	public List<Employee> getAll() {
		
		return repo.findAll();
	}
}
