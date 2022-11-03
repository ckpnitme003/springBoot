package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.icici.ICICIBank;
import com.nt.entity.sbi.SBIBank;
import com.nt.service.IBankMgmtService;

@Component
public class TestRunner implements CommandLineRunner{
	
	@Autowired
	private IBankMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		
//		SBIBank sbi=new SBIBank("HK",1000.0,"SBIFC0001");
//		System.out.println(service.registerBankAccountToSBI(sbi));
		
//		ICICIBank icici=new ICICIBank("BK",1200.0,"ICICFC0002");
//		System.out.println(service.registerBankAccountToICICI(icici));
		
		//money transfer(from sbi to icici)===============
//		System.out.println(service.transferMoneyFromSBIToICICI(43, 1, 500));
		
		//money transfer(from icici to sbi)===========
//		System.out.println(service.transferMoneyFromICICIToSBI(1, 43, 500));
	}
}
