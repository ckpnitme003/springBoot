package com.nt.service;

import org.springframework.data.domain.Page;

import com.nt.document.Employee;

public interface IEmployeeService {
	
	public Page<Employee> showEmpByPageNumber(int pageno,int pagesize);
	public void showEmployeeByPage(int pagesize);
}
