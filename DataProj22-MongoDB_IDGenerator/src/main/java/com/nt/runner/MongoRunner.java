package com.nt.runner;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeService;

@Component("runner")
public class MongoRunner implements CommandLineRunner {
	
	@Autowired
	private IEmployeeService service;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner class");
		//=====save Employee============
		
		Employee e=new Employee();
		e.setId(UUID.randomUUID().toString());
		e.setEno(new Random().nextInt(1000));
		e.setEname("suresh");
		e.setAddr("Hyd");
		System.out.println(service.register(e));
		
		
	}
}
