package com.nt.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.model.Employee;

public interface IEmployeeDao extends PagingAndSortingRepository<Employee, Integer> {

}
