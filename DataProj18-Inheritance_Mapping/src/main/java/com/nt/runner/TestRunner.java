package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Customer;
import com.nt.service.IPersonMgmtService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IPersonMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		
		/*	//create Person Object
			Person p=new Person();
			p.setPname("HK");
			
			String msg1=service.saveDataByPerson(p);
			System.out.println(msg1);*/
		
		/*//create Employee Object
		Employee e=new Employee();
		e.setPname("BK");
		e.setCompanyName("HCL");
		e.setDesg("Manager");
		e.setSal(102122.0);
		
		
		String msg2=service.saveDataByEmployee(e);
		System.out.println(msg2);*/
		
		/*	//create Customer Object
			Customer c=new Customer();
			c.setPname("ccK");
			c.setBillAmt(212.0);
			c.setBillNo(22);
			
			
			String msg3=service.saveDataByCustomer(c);
			System.out.println(msg3);*/
		
		//select By person
		service.getAlldata().forEach(p->System.out.println(p));
			
		
		
	}
	
}
