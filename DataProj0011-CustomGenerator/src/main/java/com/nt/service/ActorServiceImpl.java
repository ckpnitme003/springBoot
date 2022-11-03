package com.nt.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepo;

@Service("ActorService")
public class ActorServiceImpl implements IActorMgmtService {
	
	@Autowired
	private IActorRepo repo;
	
	@Override
	public String registerActor(Actor actor) {
		Actor ac=repo.save(actor);
		
		return "Actor deatails is saved with Id is :"+ac.getAid();
	}
	
}
