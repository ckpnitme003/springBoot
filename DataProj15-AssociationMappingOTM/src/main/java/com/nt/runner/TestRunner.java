package com.nt.runner;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.service.IPersonMgmtService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IPersonMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		
			//create Person Object
			Person p=new Person();
			p.setPname("BK");
			//create phoneNumber object
			PhoneNumber ph1=new PhoneNumber();
			ph1.setNumberType("Jio");
			ph1.setMobile(99289292L);
			PhoneNumber ph2=new PhoneNumber();
			ph2.setNumberType("airtel");
			ph2.setMobile(88289292L);
			ph1.setPer(p);
			ph2.setPer(p);
			
			Set<PhoneNumber> phone=Set.of(ph1,ph2);
			p.setPhones(phone);
			try {
			String s=service.saveDataByPerson(p);
			System.out.println(s);
			}catch(Exception e) {
				e.printStackTrace();
			}
		
			
		/*	//create phoneNumber object
			PhoneNumber ph1=new PhoneNumber();
			ph1.setNumberType("Jio");
			ph1.setMobile(99289292L);
			PhoneNumber ph2=new PhoneNumber();
			ph2.setNumberType("airtel");
			ph2.setMobile(88289292L);
			//create Person Object
			Person p=new Person();
			p.setPname("mahesh");
			ph1.setPer(p);
			ph2.setPer(p);
			
			Set<PhoneNumber> phone=Set.of(ph1,ph2);
			//			p.setPhones(phone);
			try {
			String s=service.saveDataByPhoneNumber(phone);
			System.out.println(s);
			}catch(Exception e) {
				e.printStackTrace();
			}*/
		
		/*//select Objs by parent
		Iterable<Person> it1=service.loadByParent();
		it1.forEach(p->{
		System.out.println(p);
		Set<PhoneNumber> ph=p.getPhones();
			for(PhoneNumber phones:ph) {
				System.out.println(phones);
			}
		});*/
		/*	//select Objs by child
			Iterable<PhoneNumber> it2=service.loadByChild();
			it2.forEach(ph->{
			System.out.println(ph);
			Person p=ph.getPer();
			System.out.println(p);
			});*/
		
		/*	//update obj
				String msg=service.updateObj(110,"Ravi",7777777L, 11);
				System.out.println(msg);*/
		
		/*	//delete obj
			String msg=service.removeObjById(111);
			System.out.println(msg);*/
		
		/*	//delete from child to parent
			String msg2=service.removeChildByreg(List.of(10,11));
			System.out.println(msg2);*/
		
		/*	//delete only child from parent id
			String msg3=service.removeOnlyChildFromParent(124);
			System.out.println(msg3);*/
		
	}
	
}
