package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.PersonInfo;
import com.nt.service.IPersonMgmtService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IPersonMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		/*	//save person info
			PersonInfo p=new PersonInfo();
			p.setPname("sai");
			p.setPage(25.0f);
			p.setDob(LocalDate.of(1996, 10, 9));
			p.setTob(LocalTime.of(10,12,21));
			p.setDoj(LocalDateTime.of(2022,12,3,11,11));
			
			String msg=service.registerPerson(p);
			System.out.println(msg);*/
		
		//select all person
		List<PersonInfo> li=service.getAllPerson();
		li.forEach(p->System.out.println(p));
	}
}
