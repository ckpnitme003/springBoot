package com.nt.service;

import com.nt.entity.Customer;
import com.nt.entity.Employee;
import com.nt.entity.Person;

public interface IPersonMgmtService {

	public String saveDataByPerson(Person p);
	public String saveDataByEmployee(Employee e);
	public String saveDataByCustomer(Customer c);
	public Iterable<Person> getAlldata();
	
}
