package com.nt.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Actor;
import com.nt.entity.View;

public interface IActorRepo extends JpaRepository<Actor, Integer>{
	
	public <T extends View>List<T> findByAnameIn(List<String> li,Class<T> cls);	
	public <T extends View>T findByAidEquals(int aid,Class<T> cls);	
	public <T extends View>List<T> findByAnameContainingIgnoreCase(String s,Class<T> cls);	

}
