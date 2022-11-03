package com.nt.service;


import com.nt.model.Employee;

public interface IEmployeeService {
	
	public Iterable<Employee> getAllEmp();
	public Employee registerEmp(Employee emp);
	public Employee updateEmp(Employee emp);
	public Employee GetEmp(Integer eno);
	public String deleteEmp(Integer eno);
}
