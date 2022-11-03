package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.PassportDetails;
import com.nt.entity.Person;
import com.nt.service.IPersonMgmtService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IPersonMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		/*Person p=new Person();
		p.setPname("Hk");
		PassportDetails pass=new PassportDetails();
		pass.setPassportNumber(29192);
		pass.setCountry("India");
		
		//		p.setIdDetails(pass);
		
		String msg1=service.saveDataByPerson(p);
		System.out.println(msg1);*/
		
		Person p=new Person();
		p.setPname("Hk");
		PassportDetails pass=new PassportDetails();
		pass.setPassportNumber(34424);
		pass.setCountry("India");
		pass.setPer(p);
		
		String msg2=service.saveDataByPassport(pass);
		System.out.println(msg2);
	}
}
