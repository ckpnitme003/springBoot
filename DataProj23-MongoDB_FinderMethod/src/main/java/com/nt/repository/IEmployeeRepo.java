package com.nt.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Employee;

public interface IEmployeeRepo extends MongoRepository<Employee, String> {
	
	public List<Employee> findByEnameEquals(String name);
	public Employee findByEnoEquals(Integer eno);
	public List<Employee> findByEnameContainingIgnoreCase(String character);
}
