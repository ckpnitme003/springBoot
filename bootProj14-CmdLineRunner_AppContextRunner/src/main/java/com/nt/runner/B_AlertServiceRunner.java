package com.nt.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("balertRunner")
@Order(1)
public class B_AlertServiceRunner implements CommandLineRunner{

	public B_AlertServiceRunner() {
		System.out.println("B_AlertServiceRunner- 0 param constructor");
		
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("B_AlertServiceRunner.run()");
		System.out.println("======================");
		for(String s:args) {
			System.out.println(s);
		}
		
	}
}
