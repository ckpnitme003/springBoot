package com.nt.repo.icicibank;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.icici.ICICIBank;

@Transactional
public interface IiciciBankRepo extends JpaRepository<ICICIBank, Integer> {

	@Query("update ICICIBank set balance=balance-:amt where accId=:accID")
	@Modifying
	public int withdrawAmt(int accID,double amt);
	
	@Query("update ICICIBank set balance=balance+:amt where accId=:accID")
	@Modifying
	public int depositeAmt(int accID,double amt);
}
