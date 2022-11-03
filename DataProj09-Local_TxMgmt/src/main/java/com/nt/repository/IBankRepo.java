package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.BankAccount;


public interface IBankRepo extends JpaRepository<BankAccount, Long>{
	
	@Query("update BankAccount set balance=balance-:amt where accNo=:srcAcc")
	@Modifying
	public int withDrawMoney(long srcAcc,double amt);
	
	@Query("update BankAccount set balance=balance+:amt where accNo=:destAcc")
	@Modifying
	public int depositeMoney(long destAcc,double amt);
	
		
		@Query("from BankAccount where accno=:id")
		public BankAccount getBankAccount(int id);
	
		
	
}
