package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeService;

@Component
public class PersonRunner implements CommandLineRunner {
	
	@Autowired
	private IEmployeeService service;
	
	@Override
	public void run(String... args) throws Exception {
		/*Page p=service.showEmpByPageNumber(0, 3);
		List<Employee> li=p.getContent();
		li.forEach(i->System.out.println(i));*/
		
		service.showEmployeeByPage(3);
	}
}
