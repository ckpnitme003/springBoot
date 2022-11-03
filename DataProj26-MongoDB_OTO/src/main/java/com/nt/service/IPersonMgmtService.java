package com.nt.service;


import java.util.List;

import com.nt.document.DrivingLicence;
import com.nt.document.Person;

public interface IPersonMgmtService {
	
	public String registerByPerson(Person per);
	public String registerByDrivingLicence(DrivingLicence dl);
	public List<Person> getAllByPerson();
	public List<DrivingLicence> getAllByDrivingLicence();
	
}
