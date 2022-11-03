package com.nt.service;


import com.nt.entity.Person;

public interface IPersonMgmtService {

	public String saveData(Person p);
	public Iterable<Person> getAllData();
	
}
