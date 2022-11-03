package com.nt.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Person;

public interface IPersonRepo extends JpaRepository<Person, Integer>{
	
//	@Query("select p.pid,p.pname,ph.regNo,ph.numberType,ph.mobile from Person p inner join p.phones ph")
//	@Query("select p.pid,p.pname,ph.regNo,ph.numberType,ph.mobile from Person p left outer join p.phones ph")
//	@Query("select p.pid,p.pname,ph.regNo,ph.numberType,ph.mobile from Person p right outer join p.phones ph")
	@Query("select p.pid,p.pname,ph.regNo,ph.numberType,ph.mobile from Person p full join p.phones ph")
	public List<Object[]> getDataUsingJoins();
	
	@Query("from Person p inner join fetch p.phones ph")
	public List<Person> fetchDataUsingJoinParent();
	
}
