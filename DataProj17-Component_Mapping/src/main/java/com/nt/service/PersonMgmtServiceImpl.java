package com.nt.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.repository.IPersonRepo;

@Service("personMgmtService")
public class PersonMgmtServiceImpl implements IPersonMgmtService {

	@Autowired
	private IPersonRepo perRepo;
	
	
	
	@Override
	public String saveData(Person p) {
		Person per=perRepo.save(p);
		
		return per.getPid()+ " id value Person is saved";
	}
	@Override
	public Iterable<Person> getAllData() {
		Iterable<Person> it=perRepo.findAll();
		return it;
	}
	
}
