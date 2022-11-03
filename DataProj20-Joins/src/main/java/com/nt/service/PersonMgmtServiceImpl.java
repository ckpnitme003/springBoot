package com.nt.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.repository.IPersonRepo;
import com.nt.repository.IPhoneNumberRepo;

@Service("personMgmtService")
public class PersonMgmtServiceImpl implements IPersonMgmtService {

	@Autowired
	private IPersonRepo perRepo;

	@Autowired
	private IPhoneNumberRepo phoneRepo;


	@Override
	public List<Object[]> fetchDataByJoin() {
		return perRepo.getDataUsingJoins();
	}
	@Override
	public List<Person> getDataByJoin() {
		
		return perRepo.fetchDataUsingJoinParent();
	}
	
}
