package com.nt.service;

import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepo;


@Service("ActorService")
public class ActorServiceImpl implements IActorMgmtService {
	
	@Autowired
	private IActorRepo repo;
	
	@Override
	public List<Actor> getAllElementById(List<Integer> aids) {
		
		return repo.findAllById(aids);
	}
	@Override
	public String removeAllByIdInBatch(List<Integer> ids) {
		List<Actor> li=repo.findAllById(ids);
		int count=li.size();
		repo.deleteAllByIdInBatch(ids);
		return count+" number of record are deleted";
	}
	@Override
	public Actor getActorById(int aid) {
		
		return repo.getReferenceById(aid);
	}
	@Override
	public List<Actor> getActorByActor(Actor actor, boolean order, String... properties) {
		Example<Actor> example=Example.of(actor);
		
		Sort sort=Sort.by(order?Direction.ASC:Direction.DESC, properties);
		
		
		return  repo.findAll(example, sort);
	}
}
