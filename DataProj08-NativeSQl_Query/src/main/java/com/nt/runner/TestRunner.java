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
		
		/*int count=repo.insertRecord("chandu", "Hero", 992827391l);
		System.out.println(count+ " record is inserted ");*/
		
		
		System.out.println("System date :"+repo.ShowDate());
	}
}
