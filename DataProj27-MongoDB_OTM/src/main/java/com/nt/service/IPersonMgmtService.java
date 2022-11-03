package com.nt.service;


import java.util.List;

import com.nt.document.Person;

public interface IPersonMgmtService {
	
	public String registerByPerson(Person per);
	public List<Person> getAllByPerson();

	
}
