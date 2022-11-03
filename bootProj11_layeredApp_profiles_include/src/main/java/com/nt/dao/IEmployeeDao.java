package com.nt.dao;

import java.util.List;

import com.nt.bean.Employee;

public interface IEmployeeDao {
	public List<Employee> getEmployee(String desg1,String desg2,String desg3)throws Exception;
}
