package com.nt.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.entity.Actor;

public interface IActorRepo extends PagingAndSortingRepository<Actor,Integer>{

}
