package com.nt.service;

import java.util.List;

import com.nt.entity.Person;


public interface IPersonMgmtService {

	public List<Object[]> fetchDataByJoin();
	
	public List<Person> getDataByJoin();
}
