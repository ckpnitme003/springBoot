package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobDetails;
import com.nt.entity.Person;
import com.nt.service.IPersonMgmtService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IPersonMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		//save operation
		/*Person p=new Person();
		p.setPname("pk");
		JobDetails job=new JobDetails();
		job.setCompanyName("Google");
		job.setDesg("Manager");
		job.setSal(10002222.0);
		p.setJobs(job);
		String msg=service.saveData(p); 
		System.out.println(msg);*/
		
		//select all data
		Iterable<Person> it=service.getAllData();
		it.forEach(p->System.out.println(p));
	}
}
