package com.nt.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.service.IActorMgmtService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IActorMgmtService service;

	@Override
	public void run(String... args) throws Exception {

		//save sigle record
		 try {
		Actor actor=new Actor();
		//			actor.setAid(2);
		actor.setAname("rajnikant");
		actor.setCategory("Super star");
		actor.setMobile(9992229939l);
		
		String result=service.registerActor(actor);
		System.out.println(result);
		}catch(DataAccessException dae) {
		dae.printStackTrace();
		}catch(Exception e) {
		e.printStackTrace();
		}
		
	}
}
