package com.nt.repository;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.Actor;

@Transactional
public interface IActorRepo extends JpaRepository<Actor, Integer>{
	
	@Query("update Actor set category=:category where aid=:id")
	@Modifying
	public int updateActorCategory(int id,String category);
		
	@Query("delete from Actor where aid=:id")
	@Modifying
	public int deleteActorByAid(int id);
	
	
		
	
}
