package com.nt.runner;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("bsmsalertRunner")
@Order(3)
public class B_SMSAlertServiceRunner implements ApplicationRunner{

	public B_SMSAlertServiceRunner() {
		System.out.println("B_SMS AlertServiceRunner- 0 param constructor");

	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("B_SMSAlertServiceRunner.run()");
		System.out.println("======================");
		
		System.out.println("all non optional args :"+args.getNonOptionArgs());
		System.out.println("all optional names args :"+args.getOptionNames());
		System.out.println("optional value args :"+args.getOptionValues("key4"));
		System.out.println("all optional and non optional args :"+Arrays.toString(args.getSourceArgs()));
	}
}
