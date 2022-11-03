package com.nt.repo.sbibank;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.sbi.SBIBank;

@Transactional
public interface ISBIBankRepo extends JpaRepository<SBIBank, Integer> {

	@Query("update SBIBank set balance=balance-:amt where accId=:accID")
	@Modifying
	public int withdrawAmt(int accID,double amt);
	
	@Query("update SBIBank set balance=balance+:amt where accId=:accID")
	@Modifying
	public int depositeAmt(int accID,double amt);
}
