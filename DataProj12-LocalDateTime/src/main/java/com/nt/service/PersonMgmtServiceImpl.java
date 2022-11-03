package com.nt.service;

import java.util.List;

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
	public List<PersonInfo> getAllPerson() {
		List<PersonInfo> li=repo.findAll();
		return li;
	}
}
