package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
	@Override
	public String registerActorsGroup(Iterable li) {
		List<Actor> al=(List<Actor>) repo.saveAll(li);
		if(al!=null) {
			List<Integer> ids=al.stream().map(actor->actor.getAid()).collect(Collectors.toList());
			
			return  ids.size()+" actor is saved with id values :"+ids;
		}
		return "problem in Saving";
	}
	@Override
	public Long countElements() {
		long count=repo.count();
		return count;
	}
	@Override
	public Iterable<Actor> fetchAll() {
		return repo.findAll();
	}
	@Override
	public boolean isExist(int id) {
		return repo.existsById(id);
	}
	@Override
	public Iterable<Actor> fetchAllById(Iterable<Integer> id) {
		return repo.findAllById(id);
	}
	@Override
	public Optional<Actor> fetchById(int id) {
		Optional<Actor> opt1=repo.findById(id);
		return opt1;
		
	}
	@Override
	public Actor ShowById(int id) {
		Optional<Actor> opt=repo.findById(id);
//		Actor ac=opt.orElseThrow(()->new IllegalArgumentException("Actor is not available"));
//		Actor ac=opt.orElseThrow();//errormsg:No value present
//		Actor ac=opt.orElse(new Actor());//if not available intiate with defalut value
		Actor ac=opt.orElse(new Actor(101,"hk","teacher",9929929l));//if not available intiate with defalut value
		return ac;
	}
	@Override
	public String UpdateActorMobile(int id, long mob) {
		Optional<Actor> opt=repo.findById(id);
		if(opt.isPresent()) {
			Actor ac=opt.get();
			ac.setMobile(mob);
			//update
			Actor actor=repo.save(ac);
			return "Id "+actor.getAid()+" is updated with mobile number :"+mob;
		}else {
			return "Id "+id+" is not found";
		}
	}
	@Override
	public String UpdateActor(Actor ac) {
		Optional<Actor> opt=repo.findById(ac.getAid());
		if(opt.isPresent()) {
			Actor actor=repo.save(ac);
			return "Id "+actor.getAid()+" is updated successfully";
		}else {
			return "Id "+ac.getAid()+" is not found";
		}
	}
	@Override
	public String registerOrUpdateActor(Actor ac) {
		Actor actor=repo.save(ac);
		return actor.getAid()+" is saved or updated";
	}
	@Override
	public String removeActorByid(int id) {
		Optional<Actor> opt=repo.findById(id);
		if(opt.isPresent()) {
			repo.deleteById(id);
			return "Id :"+id+" actor is deleted";
		}else {
			return "Id :"+id+" actor not found";
		}
	}
	@Override
	public String removeActor(Actor actor) {
		
		if(repo.existsById(actor.getAid())) {
			repo.delete(actor);
			return "Id :"+actor.getAid()+" actor is deleted";
		}else {
			return "Id :"+actor.getAid()+" actor not found";
		}
	}
	@Override
	public String removeAll() {
		repo.deleteAll();
		return "all actor are deleted";
	}
	@Override
	public String removeAllByIds(Iterable<Integer> id) {
		
		repo.deleteAllById(id);//all id must be there in db table
		return ((List<Integer>)id).size()+" is deleted ";
	}
}
