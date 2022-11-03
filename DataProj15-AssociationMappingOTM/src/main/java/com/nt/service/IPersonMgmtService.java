package com.nt.service;

import java.util.List;
import java.util.Set;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;

public interface IPersonMgmtService {

	public String saveDataByPerson(Person p);
	public String saveDataByPhoneNumber(Set<PhoneNumber> st);
	public Iterable<Person> loadByParent();
	public Iterable<PhoneNumber> loadByChild();
	public String updateObj(int id,String name,Long mobile,int reg);
	public String removeObjById(int pid);
	public String removeChildByreg(List<Integer> regnos);
	public String removeOnlyChildFromParent(int pid);
}
