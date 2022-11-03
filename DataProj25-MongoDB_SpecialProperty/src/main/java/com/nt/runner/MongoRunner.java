package com.nt.runner;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

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
			/*	Employee e=new Employee();
				e.setEno(104);
				e.setEname("Rambabu");
				e.setNicknames(new String[] {"mahi","ramu"});
				e.setFriends(List.of("Mahi","Bk","DN"));
				e.setPhoneNo(Set.of(9992991l,882122l));
				e.setDept(Map.of("Developer","10","tester","11"));
				Properties prop=new Properties();
				prop.put("aadhar","12031asda");
				prop.put("PAN","w2f0wad3123");
				e.setIdDetails(prop);
				
				System.out.println(service.register(e));
				
			*/
		//select=============
		service.getAll().forEach(p->System.out.println(p));
	}
}
