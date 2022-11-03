package com.nt.runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IEmployeeRepo;

@Component("runner")
public class MongoRunner implements CommandLineRunner {
	
	@Autowired
	private IEmployeeRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner class");
		
//		repo.findByEnameEquals("Raja").forEach(p->System.out.println(p));
		
//		System.out.println(repo.findByEnoEquals(105));

		repo.findByEnameContainingIgnoreCase("r").forEach(p->System.out.println(p));
	}
}