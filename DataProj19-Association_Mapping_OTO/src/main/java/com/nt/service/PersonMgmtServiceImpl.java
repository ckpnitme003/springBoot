package com.nt.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.PassportDetails;
import com.nt.entity.Person;
import com.nt.repository.IPassportRepo;
import com.nt.repository.IPersonRepo;

@Service("personMgmtService")
public class PersonMgmtServiceImpl implements IPersonMgmtService {

	@Autowired
	private IPersonRepo perRepo;
	
	@Autowired
	private IPassportRepo passRepo;
	
	
	
	@Override
	public String saveDataByPerson(Person p) {
		Person per=perRepo.save(p);
		
		return per.getPid()+ " id value Person is saved";
	}
	@Override
	public String saveDataByPassport(PassportDetails pass) {
		PassportDetails pa=passRepo.save(pass);
		return " Passport details is saved";
	}
	/*	@Override
		public Iterable<Person> getAllData() {
			Iterable<Person> it=perRepo.findAll();
			return it;
		}*/
	
}
