package com.nt.dao;

import org.springframework.data.repository.CrudRepository;

import com.nt.model.Employee;

public interface IEmployeeDao extends CrudRepository<Employee, Integer> {

}
