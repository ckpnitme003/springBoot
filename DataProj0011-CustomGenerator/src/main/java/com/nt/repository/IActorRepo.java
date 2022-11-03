package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Actor;

public interface IActorRepo extends CrudRepository<Actor,Integer>{

}
