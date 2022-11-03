package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.DrivingLicence;
import com.nt.document.Person;
import com.nt.repository.IDrivingLicenceRepo;
import com.nt.repository.IPersonRepo;

@Service("serviceEmployee")
public class PersonMgmtServiceImpl implements IPersonMgmtService {
	
	@Autowired
	private IPersonRepo perrepo;
	
	@Autowired
	private IDrivingLicenceRepo dlrepo;
	
	@Override
	public String registerByPerson(Person per) {
		Person p=perrepo.insert(per);
		return "Person is saved with Id value ="+p.getPid();
	}
	@Override
	public String registerByDrivingLicence(DrivingLicence dl) {		
		DrivingLicence drive=dlrepo.insert(dl);
		return "Driving licence is saved with Id value ="+drive.getLid();
	}
	@Override
	public List<Person> getAllByPerson() {
		return perrepo.findAll();
	}
	@Override
	public List<DrivingLicence> getAllByDrivingLicence() {
		return dlrepo.findAll();
	}
	
}
