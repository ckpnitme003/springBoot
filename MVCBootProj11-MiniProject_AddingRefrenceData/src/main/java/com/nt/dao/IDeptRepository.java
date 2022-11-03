package com.nt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nt.model.Department;

public interface IDeptRepository extends CrudRepository<Department, Integer> {

	@Query("select deptNo from Department")
	public List<Integer> getAllDeptNo();
}
