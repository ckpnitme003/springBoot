package com.nt.service;


import java.util.List;

import com.nt.document.Employee;

public interface IEmployeeService {
	
	public String register(Employee e);
	public List<Employee> getAll();
	
}
