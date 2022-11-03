package com.nt.service;

import com.nt.entity.icici.ICICIBank;
import com.nt.entity.sbi.SBIBank;

public interface IBankMgmtService {
	public String registerBankAccountToSBI(SBIBank bank); 
	public String registerBankAccountToICICI(ICICIBank bank); 
	public String transferMoneyFromSBIToICICI(int srcAccId,int destAccId,double amt);
	public String transferMoneyFromICICIToSBI(int srcAccId,int destAccId,double amt);
}
