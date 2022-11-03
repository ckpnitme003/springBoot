package com.nt.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.icici.ICICIBank;
import com.nt.entity.sbi.SBIBank;
import com.nt.repo.icicibank.IiciciBankRepo;
import com.nt.repo.sbibank.ISBIBankRepo;

@Service("bankservice")
public class BankMgmtServiceImpl implements IBankMgmtService {

	@Autowired
	private ISBIBankRepo sbiRepo;
	@Autowired
	private IiciciBankRepo iciciRepo;
	
	@Override
	public String registerBankAccountToSBI(SBIBank bank) {
		SBIBank sbi=sbiRepo.save(bank);
		
		return "Sbi bank account is created with account id :"+sbi.getAccId();
	}
	@Override
	public String registerBankAccountToICICI(ICICIBank bank) {
		ICICIBank icici=iciciRepo.save(bank);
		
		return "ICICI bank account is created with account id :"+icici.getAccId();
	}
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public String transferMoneyFromSBIToICICI(int srcAccId, int destAccId, double amt) {
		Optional opt1=sbiRepo.findById(srcAccId);
		Optional opt2=iciciRepo.findById(destAccId);
		
	
		
		if(opt1.isPresent()) {
			
			SBIBank sbi=(SBIBank) opt1.get();
			double balance=sbi.getBalance();
			sbi.setBalance(balance-amt);
			sbiRepo.save(sbi);
		}else {
			return "source account id not found";
		}
		if(opt2.isPresent()) {
			
			ICICIBank icici=(ICICIBank) opt2.get();
			double balance=icici.getBalance();
			icici.setBalance(balance+amt);
			iciciRepo.save(icici);
		}else {
			return "destination account id not found";
		}
		return "Money is Transfered successfully";
	}
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public String transferMoneyFromICICIToSBI(int srcAccId, int destAccId, double amt) {
		
		int count1=sbiRepo.depositeAmt(destAccId, amt);
		int count2=iciciRepo.withdrawAmt(srcAccId, amt);
		
		if(count1==0 ||count2==0)
			throw new RuntimeException("problem in Money Transfer");
		
		return "Money is Transfered successfully";
		
	}
}
