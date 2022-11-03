package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.PersonInfo;
import com.nt.repository.IPersonRepo;

@Service("serviceimpl")
public class PersonMgmtServiceImpl implements IPersonMgmtService {
	
	@Autowired
	private IPersonRepo repo;
	
	@Override
	public String registerPerson(PersonInfo person) {
		PersonInfo per=repo.save(person);
		return "person Id ="+per.getPid()+" is saved";
	}
	@Override
	public PersonInfo getPersonById(int id) {
		Optional<PersonInfo> op=repo.findById(id);
		if(op.isPresent())
			return op.get();
		else
			throw new IllegalArgumentException("Invalid Id");
	}
}
