package com.nt.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepo;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IActorRepo repo;

	@Override
	public void run(String... args) throws Exception {
		//update=======================
		/*	int count1=repo.updateActorCategory(29, "Director");
			System.out.println(count1+" record is updated");*/
		
		/*//delete===================
		int count2=repo.deleteActorByAid(30);
		System.out.println(count2+" record is deleted");*/
		
		/*		Actor ac=repo.save(new Actor("shardha","ActionDirector",88829829l));
				System.out.println(ac+" is saved");*///for save tx not required
		
	}
}
