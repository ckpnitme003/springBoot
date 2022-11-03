package com.nt.service;

import java.util.List;

import com.nt.entity.Actor;

public interface IActorMgmtService {
	
	public List<Actor>  getAllElementById(List<Integer> aids);
	public String removeAllByIdInBatch(List<Integer> ids);
	public Actor getActorById(int aid);
	public List<Actor> getActorByActor(Actor actor,boolean order,String... properties);
	
}
