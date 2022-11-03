package com.nt.runner;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Person;
import com.nt.document.PhoneNumber;
import com.nt.service.IPersonMgmtService;

@Component("runner")
public class MongoRunner implements CommandLineRunner {
	
	@Autowired
	private IPersonMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner class");
		/*//=====save Parent to child============
		Person p=new Person();
		p.setPid(new Random().nextInt(1000));
		p.setPname("ck");
		p.setPaddrs("hyd");
		
		//child Obj
		PhoneNumber ph1=new PhoneNumber();
		ph1.setPhid(new Random().nextInt(100));
		ph1.setNumberType("Airtel");
		ph1.setPhno(999988288l);
		
		PhoneNumber ph2=new PhoneNumber();
		ph2.setPhid(new Random().nextInt(100));
		ph2.setNumberType("Jio");
		ph2.setPhno(8828998988l);
		
		p.setMobileDetails(Set.of(ph1,ph2));
		System.out.println(service.registerByPerson(p));
		*/
		//select all by parent
		service.getAllByPerson().forEach(p->System.out.println(p));
		
			
	}
}
