package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.BankAccount;
import com.nt.repository.IBankRepo;

@Service("serviceImpl")
public class BankServiceImpl implements IBankService {

	@Autowired
	private IBankRepo repo;
	
	@Override
//	@Transactional
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = IllegalAccessException.class,timeout = 10)
	public String transferMoney(long srcAcc, long destAcc, double amt) throws Exception {
		
		int res1=repo.withDrawMoney(srcAcc, amt);
//		Thread.sleep(15000);
		int res2=repo.depositeMoney(destAcc, amt);
		
		if(res1==0||res2==0) 
//			throw new RuntimeException("problem in transfer money");
			throw new IllegalAccessException("problem in transfer money");
		
		else
			return "money is successfully transfered";
		
	}
		@Override
		public BankAccount getAccount(int id) {
			
			return repo.getBankAccount(id);
		}
		
		@Override
		public BankAccount saveBank(BankAccount acount) {
			BankAccount acc=repo.save(acount);
			return acc;
		}
}
