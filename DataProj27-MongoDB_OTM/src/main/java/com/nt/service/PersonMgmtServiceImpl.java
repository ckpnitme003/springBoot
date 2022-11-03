package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Person;
import com.nt.repository.IPersonRepo;
import com.nt.repository.IPhoneNumberRepo;

@Service("serviceEmployee")
public class PersonMgmtServiceImpl implements IPersonMgmtService {
	
	@Autowired
	private IPersonRepo perrepo;
	
	@Autowired
	private IPhoneNumberRepo phrepo;
	
	@Override
	public String registerByPerson(Person per) {
		Person p=perrepo.insert(per);
		return "Person is saved with Id value ="+p.getPid();
	}
	@Override
	public List<Person> getAllByPerson() {
		return perrepo.findAll();
	}
	
}
