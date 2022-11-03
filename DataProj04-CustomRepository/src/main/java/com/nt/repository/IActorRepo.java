package com.nt.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Actor;
import com.nt.entity.ResultView;

public interface IActorRepo extends JpaRepository<Actor, Integer>{
	
	
	/*	public List<Actor> findByAnameEquals(String name);
		public List<Actor> findByAnameIgnoreCase(String name);
		public List<Actor> findByAnameIs(String name);
		public List<Actor> findByAname(String name);
		public Actor findByAidAndAname(int id,String name);
		public List<Actor> findByAidOrAname(int id,String name);
		public List<Actor> findByAidBetween(int id1,int id2);
		public List<Actor> findByAidLessThan(int id);
		public List<Actor> findByAidLessThanEqual(int id);
		public List<Actor> findByAidGreaterThan(int id);
		public List<Actor> findByAidGreaterThanEqual(int id);
		public List<Actor> findByAnameLike(String name);
		public List<Actor> findByAnameStartingWith(String name);
		public List<Actor> findByAnameContaining(String name);
		public List<Actor> findByAnameNot(String name);
		public List<Actor> findByAidIn(List id);
		public List<Actor> findByAidNotIn(List id);
		public List<Actor> findByAidGreaterThanEqualAndAidLessThanEqualOrderByAnameDesc(int start,int end );
		*/
	//scalar
	public Iterable<ResultView> findByCategoryEquals(String category);
	public ResultView findByAidEquals(int aid);
}
