package com.nt.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nt.model.Employee;

public interface IEmployeeService {
	
	public Iterable<Employee> getAllEmp();
	public Employee registerEmp(Employee emp);
	public Employee updateEmp(Employee emp);
	public Employee GetEmp(Integer eno);
	public String deleteEmp(Integer eno);
	public Iterable<Employee> getEmpByPageNo(int pageNo);
	public Page<Employee> getEmpsByPage(Pageable pageable);
}
