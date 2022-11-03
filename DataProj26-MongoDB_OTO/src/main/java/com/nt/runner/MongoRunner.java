package com.nt.runner;
import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.DrivingLicence;
import com.nt.document.Person;
import com.nt.service.IPersonMgmtService;

@Component("runner")
public class MongoRunner implements CommandLineRunner {
	
	@Autowired
	private IPersonMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner class");
		/*	//=====save Person to DrivingLicence============
			Person p=new Person();
			p.setPid(new Random().nextInt(1000));
			p.setPname("ck");
			p.setPaddrs("hyd");
			
			//child Obj
			DrivingLicence dl=new DrivingLicence();
			dl.setLid(new Random().nextInt(100));
			dl.setLicenceType("4 wheeler");
			dl.setExpiryDate(LocalDateTime.of(2024,12,22,23,22));
			
			p.setLiDetails(dl);
			System.out.println(service.registerByPerson(p));*/
		
		
			//=====save  DrivingLicence to Person============
		
			/*//child Obj
			DrivingLicence dl=new DrivingLicence();
			dl.setLid(new Random().nextInt(100));
			dl.setLicenceType("4 wheeler");
			dl.setExpiryDate(LocalDateTime.of(2024,12,22,23,22));
			
			//person===
				Person p=new Person();
				p.setPid(new Random().nextInt(1000));
				p.setPname("ck");
				p.setPaddrs("hyd");
				
				dl.setPersonDetails(p);
				System.out.println(service.registerByDrivingLicence(dl));
				*/
		
				//select by parent
				service.getAllByPerson().forEach(p->System.out.println(p));
		
			//select by parent
//				service.getAllByDrivingLicence().forEach(p->System.out.println(p));
	}
}
