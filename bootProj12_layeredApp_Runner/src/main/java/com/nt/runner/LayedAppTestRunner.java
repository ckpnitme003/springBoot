package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.bean.Employee;
import com.nt.controller.MainController;

@Component("layedTest")
public class LayedAppTestRunner implements CommandLineRunner {

	@Autowired
	private MainController controller;
	
	public LayedAppTestRunner() {
		System.out.println("Layed test runner-0 param constructor");
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("LayedAppTestRunner.run()");
		try {
			List<Employee> li = controller.getList("developer", "manager", "clerk");
			System.out.println("==================");
			li.stream().forEach(p -> System.out.println(p));
			System.out.println("==================");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
