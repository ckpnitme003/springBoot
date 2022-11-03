package com.nt.service;

import com.nt.entity.BankAccount;

public interface IBankService {
	
	public String transferMoney(long srcAcc,long destAcc,double amt) throws Exception;
	public BankAccount getAccount(int id);
	public BankAccount saveBank(BankAccount acount) ;
}
