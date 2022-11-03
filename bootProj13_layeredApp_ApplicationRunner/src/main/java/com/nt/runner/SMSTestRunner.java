package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.nt.bean.Employee;
import com.nt.controller.MainController;

@Component("smsRunner")
public class SMSTestRunner implements ApplicationRunner{

	@Autowired
	private MainController controller;
	
	public SMSTestRunner() {
		System.out.println("SMS runner-0 param constructor");
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("SMSRunner.run()");
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
