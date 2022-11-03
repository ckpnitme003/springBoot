package com.nt.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.EmployeeInfo;
import com.nt.repository.IEmployeeRepo;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeRepo repo;

	@Override
	public void run(String... args) throws Exception {
		
		//save operation
		/*EmployeeInfo e=new EmployeeInfo();
		
		e.setEname("Ramu");
		e.setNickNames(new String[] {"ram","ramaya"});
		e.setFriends(List.of("naina","krish","sita"));
		e.setPhoneNumbers(Set.of(9292999190L,9282888818L));
		e.setIdDetails(Map.of("aadhar",728281882182L,"pan",128199182L));
		
		EmployeeInfo newE=repo.save(e);
		System.out.println("Employee is saved with id :"+newE.getEid());
		*/
		
		
		//select Operation
		List<EmployeeInfo> li = repo.findAll();
		li.forEach(p->System.out.println(p));
	}
	
}
