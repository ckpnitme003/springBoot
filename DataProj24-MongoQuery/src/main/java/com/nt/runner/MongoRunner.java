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
		
//		System.out.println(repo.getEmployeeByeno(102));
		
//		repo.getEmployeeBySal(30000.0).forEach(p->System.out.println(p));
		
		/*	repo.getEmpByAddrs("Hyd").forEach(row->{
				for(Object obj:row) {
					System.out.print(obj+" ");
				}
				System.out.println();
			});*/
		
		//select Entity
//		repo.getAllByAddrs("Hyd").forEach(p->System.out.println(p));
		
//		repo.getAllByBySal(10000.0, 30000.0).forEach(p->System.out.println(p));
		
//		repo.getAllByByEname("suresh","tK").forEach(p->System.out.println(p));
		
//		repo.getAllByEnameStartsChar("^R").forEach(p->System.out.println(p));
		
//		repo.getAllByEnameEndsChar("h$").forEach(p->System.out.println(p));
		
//		repo.getAllByEnameContainingChar("u").forEach(p->System.out.println(p));
		
//		System.out.println(repo.getCountOfEmpBySal(10000, 100000));
		
//		repo.showAllByEnameSort().forEach(p->System.out.println(p));
		
//		System.out.println(repo.doesEmpExistWithIsvaccinatedIsNull());
		
//		System.out.println(repo.removeEmpWithInSalRange(100000,200000));
		
	}
}
