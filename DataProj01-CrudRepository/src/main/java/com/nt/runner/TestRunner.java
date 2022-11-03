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

		/*	//save sigle record
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
			}*/
		//save in group
		/*	try {
				List<Actor> li=List.of(new Actor("ranveer","Hero",938992l),
										new Actor("amitab","Hero",948339292l),
										new Actor("priyankaMoni","Heroin",948339292l),
										new Actor("Ramu","Hero",948339292l),
										new Actor("Ramu","Hero",948339292l),
										new Actor("shardha","Heroin",948339292l));
				
				
				String result=service.registerActorsGroup(li);
				System.out.println(result);
			}catch(DataAccessException dae) {
				dae.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		*/
		/*	//count
			System.out.println("===================");
			try {
				long count=service.countElements();
				System.out.println("Count no. of records :"+count);
			}catch(DataAccessException dae) {
				dae.printStackTrace();
			}*/
		System.out.println("===================");
		//findAll
		try {
			Iterable<Actor> itr=service.fetchAll();
			System.out.println(" All records are:");
			for(Actor a: itr) {
				System.out.println(a);
				
			}
		}catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		/*	System.out.println("===================");
			//existById
			try {
				boolean isexist=service.isExist(1);
				System.out.println(" 1 id available :"+isexist);
			}catch(DataAccessException dae) {
				dae.printStackTrace();
			}*/
		/*	System.out.println("===================");
			//find All by ids
			try {
				Iterable<Actor> itr=service.fetchAllById(Arrays.asList(23,24,101,null));
					itr.forEach(p->System.out.println(p));
			}catch(DataAccessException dae) {
				dae.printStackTrace();
			}
			System.out.println("===================");*/
				/*	//find by id
					try {
						Optional<Actor> opt1=service.fetchById(6);
						if(opt1.isPresent())
							System.out.println("Actor info :"+opt1.get());
						else
							System.out.println("Actor info not available");
							
						
					}catch(DataAccessException dae) {
						dae.printStackTrace();
					}
					System.out.println("===================");*/
				/*	//find by id(2)
					try {
						Actor ac=service.ShowById(6);
						System.out.println(ac);
						
					}catch(DataAccessException dae) {
						dae.printStackTrace();
					}*/
		/*System.out.println("===================");
		//update mobile number
		try {
			String res=service.UpdateActorMobile(5,829282922l);
			System.out.println(res);
			
		}catch(DataAccessException dae) {
			dae.printStackTrace();
		}*/
		/*	//full update Actor
			try {
				String res=service.UpdateActor(new Actor(4,"ranveer","hero",928899999l));
						Actor ac=new Actor();
						ac.setAid(4);
						ac.setAname("juhi");
						ac.setCategory("heroin");
						String res=service.UpdateActor(ac);
				System.out.println(res);
				
			}catch(DataAccessException dae) {
				dae.printStackTrace();
			}*/
		/*	System.out.println("===================");
			//save or update
			try {
		//			String res=service.registerOrUpdateActor(new Actor(4,"jitu","hero",928899999l));
				String res=service.registerOrUpdateActor(new Actor("Ranveer","hero",928899999l));
				System.out.println(res);
				
			}catch(DataAccessException dae) {
				dae.printStackTrace();
			}*/
		/*System.out.println("===================");
		//delete Byid
		try {
			System.out.println(service.removeActorByid(21));
		}catch(DataAccessException dae) {
			dae.printStackTrace();
		}*/
		/*	System.out.println("===================");
			//delete Actor
			try {
				System.out.println(service.removeActor(new Actor(4,"raju","hero",988398892l)));
			}catch(DataAccessException dae) {
				dae.printStackTrace();
			}*/
		/*System.out.println("===================");
		//delete all Actors
		try {
			System.out.println(service.removeAll());
		}catch(DataAccessException dae) {
			dae.printStackTrace();
		}*/
		/*System.out.println("===================");
		//delete Actor by all ids
		try {
			System.out.println(service.removeAllByIds(List.of(2,3)));
		}catch(DataAccessException dae) {
			dae.printStackTrace();
		}*/
	}
}
