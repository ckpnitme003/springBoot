package com.nt.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("alertRunner")

public class AlertServiceRunner implements CommandLineRunner,Ordered{

	public AlertServiceRunner() {
		System.out.println("AlertServiceRunner- 0 param constructor");
		
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("AlertServiceRunner.run()");
		System.out.println("======================");
		for(String s:args) {
			System.out.println(s);
		}
		
	}
	@Override
	public int getOrder() {
		return 0;
	}
}
