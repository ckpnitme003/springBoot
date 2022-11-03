package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.BankAccount;
import com.nt.service.IBankService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IBankService service;

	@Override
	public void run(String... args) throws Exception {
			System.out.println("Runner class");
			try {
			String res=service.transferMoney(29, 30,1000);
			System.out.println(res);
			}catch(Exception e) {
				e.printStackTrace();
				
			}
			
			/*BankAccount account=service.getAccount(43);
			System.out.println(account);*/
			
			/*	BankAccount bank=service.saveBank(new BankAccount("Hari",40000.0));
				System.out.println(bank);*/
		
	}
}
