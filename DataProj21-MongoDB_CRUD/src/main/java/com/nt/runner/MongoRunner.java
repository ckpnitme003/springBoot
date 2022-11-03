package com.nt.runner;
import java.util.List;

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
		/*Employee e=new Employee();
		e.setEno(102);
		e.setEname("suresh");
		e.setAddr("Hyd");
		System.out.println(service.register(e));*/
		
		//====select All==================
		/*List<Employee> li=service.showAll();
		li.forEach(p->System.out.println(p));*/
		
		//=====save Multiple Employee saveAll()============
		/*	Employee e1=new Employee(104,"DK","Delhi");
			Employee e2=new Employee(105,"tK","Delhi");
			Employee e3=new Employee(106,"fK","Delhi");
				System.out.println(service.registerMultipleSaveAll(List.of(e1,e2,e3)));*/
		
		/*	//====select record by sort by eno ===========
			service.showAllBySortByEno(false).forEach(p->System.out.println(p));*/
		
		/*		//====select record by passing Example Obj  ===========
			Employee e=new Employee();
			e.setEname("DK");
			e.setAddr("delhi");
				service.showByExamplePassingProperty(e).forEach(p->System.out.println(p));
				*/
			//====find By ID  ===========
//			System.out.println(service.fetchById("630de1118ed69d4a735b3d5f"));
		 
		//====update by Id  ===========
//			System.out.println(service.updateSalById("630e03d349b6aa42b3501c17",12000.0));
			
			//====delete by Id  ===========
//			System.out.println(service.removeById("630e03d349b6aa42b3501c17"));
		
		//update in bulk==========
		System.out.println(service.updateBulkVaccinated(false));
	}
}
