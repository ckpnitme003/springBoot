package com.nt.runner;


import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.PhoneNumber;
import com.nt.service.IPersonMgmtService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IPersonMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		
		/*	//get Data using joins
			service.fetchDataByJoin().stream().forEach(row->{
			for(Object ob:row) {
				System.out.print(ob+" ");
			}	
			System.out.println();
			});*/
		
		//getPerson by List<person>
		service.getDataByJoin().forEach(per->{
			System.out.println(per);
			Set<PhoneNumber> phs=per.getPhones();
			phs.forEach(ph->System.out.print(ph));
			System.out.println();
		});
		}
}
