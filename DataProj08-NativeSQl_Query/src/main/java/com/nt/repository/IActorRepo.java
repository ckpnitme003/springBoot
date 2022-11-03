package com.nt.repository;





import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.Actor;

@Transactional
public interface IActorRepo extends JpaRepository<Actor, Integer>{
	
	@Query(nativeQuery = true,value = "INSERT INTO DATAJPA_ACTOR (AID,ANAME,CATEGORY,MOBILE) VALUES(SQ2.NEXTVAL,?,?,?)")
	@Modifying
	public int insertRecord(String aname,String cat,long mobile);
	
	@Query(nativeQuery = true,value = "SELECT SYSDATE FROM DUAL")
	public Date ShowDate( );
		
	
}
