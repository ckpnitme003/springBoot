package com.nt.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Actor;

public interface IActorRepo extends JpaRepository<Actor, Integer>{
	
//	@Query("from Actor where category=?1")
//	@Query("from Actor a where a.category=?1")
//	@Query("from com.nt.entity.Actor where category=?1")
//	@Query("from Actor where category=:role")//CE
	/*@Query("from Actor where category=:role")
	public Iterable<Actor> searchActorByCategory(@Param("role")String category);*/
	
	@Query("from Actor where category=:category")
	public Iterable<Actor> searchActorByCategory(String category);
	
	@Query("from Actor where category in (:categories1,:categories2)")
	public Iterable<Actor> searchActorByCategoryIn(String categories1,String categories2);
	
	//select Entity
	@Query("from Actor where category in(:cat1,:cat2) order by aname")
	public List<Actor> findAllActorByCategory(String cat1,String cat2);
	
	//select Multiple columns
	@Query("select aid,aname,category from Actor where aname in(:name1,:name2) order by aname")
	public List<Object[]> findAllActorByNameMultiple(String name1,String name2);
	
	//select multiple record ,single columns
	@Query("select aname from Actor where aname like :name%")
	public List<String> findAllActorByNameLetter(String name);
	
	//=================================================
	//select single record ,Entity
		@Query("from Actor where aid=:id")
		public Actor findActorByAid(int id);
		
		//select single record ,Entity
		@Query("from Actor where aid=:id")
		public Optional<Actor> findActorByAid1(int id);
		
		//select single record ,Entity
		@Query("select aid,aname,category from Actor where aid=:id")
		public Object findActorColByAid(int id);
		/*//select single record ,Entity
		@Query("select aid,aname,category from Actor where aid=:id")
		public Object[] findActorColByAid1(int id);*/
	
		//select single record ,Entity
		@Query("select aname from Actor where aid=:id")
		public String findActorNameByAid(int id);
		
		//===================================
		//aggregate function
		
		//select count
		@Query("select count(*) from Actor where category=:cat")
		public int findActorCountByCategory(String cat);
		
		//select all aggregate
		@Query("select count(*),max(aid),min(aid),sum(aid),avg(aid) from Actor")
		public Object findActorAllAggregate();
		
		//select subquery
		@Query("from Actor where aid=(select max(aid) from Actor)")
		public Actor findActorMaxAid();
	
}
