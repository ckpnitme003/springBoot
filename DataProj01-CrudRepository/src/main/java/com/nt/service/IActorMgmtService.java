package com.nt.service;


import java.util.Optional;

import com.nt.entity.Actor;

public interface IActorMgmtService {
	
	public String registerActor(Actor actor);
	public String registerActorsGroup(Iterable li);
	public Long countElements();
	public Iterable<Actor> fetchAll();
	public boolean isExist(int id);
	public Iterable<Actor> fetchAllById(Iterable<Integer> id);
	public Optional<Actor> fetchById(int id);
	public Actor ShowById(int id);
	public String UpdateActorMobile(int id,long mob);
	public String UpdateActor(Actor ac);
	public String registerOrUpdateActor(Actor ac);
	public String removeActorByid(int id);
	public String removeActor(Actor actor);
	public String removeAll();
	public String removeAllByIds(Iterable<Integer> id);
}
