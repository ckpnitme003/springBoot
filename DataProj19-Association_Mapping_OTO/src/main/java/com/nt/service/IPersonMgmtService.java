package com.nt.service;


import com.nt.entity.PassportDetails;
import com.nt.entity.Person;

public interface IPersonMgmtService {

	public String saveDataByPerson(Person p);
	public String saveDataByPassport(PassportDetails pass);
//	public Iterable<Person> getAllData();
	
}
