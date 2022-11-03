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
		
		/*Iterable<Actor> itr1=repo.searchActorByCategory("Hero");
		itr1.forEach(p->System.out.println(p));*/
		/*
		Iterable<Actor> itr2=repo.searchActorByCategoryIn("Hero","Heroin");
		itr2.forEach(p->System.out.println(p));*/
		
		/*System.out.println("=======Select Entity=======");
		List<Actor> li1=repo.findAllActorByCategory("Hero","Heroin");
		li1.forEach(p->System.out.println(p));*/
		
		/*System.out.println("=======Select Multiple column Scalar=======");
		List<Object[]> li2=repo.findAllActorByNameMultiple("ranveer","Ramu");
		li2.forEach(p->{
			for(Object o:p) {
				System.out.print(o+" ");
			}
			System.out.println();
		});*/
		/*System.out.println("=======Select Multiple column,Single column Scalar=======");
		List<String> li3=repo.findAllActorByNameLetter("R");
		li3.forEach(p->System.out.println(p));*/
		
		/*	System.out.println("=======Select Entity,single record=======");
			Actor ac=repo.findActorByAid(25);
			System.out.println(ac);*/
		/*	System.out.println("=======Select Entity,single record=======");
			Optional<Actor> opt=repo.findActorByAid1(25);
			System.out.println(opt.get());*/
		
		
		/*	System.out.println("=======Select multiple column,single record=======");
			Object obj=repo.findActorColByAid(25);
			Object[] ob=(Object[])obj;
			for(Object o:ob) {
				System.out.print(o+" ");
			}
			System.out.println();*/
		/*	System.out.println("=======Select multiple column,single record=======");
			Object[] obj=repo.findActorColByAid1(25);
			
			for(Object o:obj) {
				System.out.print(o+" ");//[Ljava.lang.Object;@aa633e6 
			}
			System.out.println();*/
		
		/*
		System.out.println("=======Select single column,single record=======");
		String name=repo.findActorNameByAid(25);
		System.out.println(name);*/
		
		/*//aggregate functiton================================
		System.out.println("=======Select count by name=======");
		int count=repo.findActorCountByCategory("Hero");
		System.out.println(count);*/
		
		/*//all aggregate functiton================================
		System.out.println("=======Select all aggegate function =======");
		Object[] res=(Object[])repo.findActorAllAggregate();
		System.out.println("Count :"+res[0]);
		System.out.println("Max(aid) :"+res[1]);
		System.out.println("Min(aid) :"+res[2]);
		System.out.println("sum :"+res[3]);
		System.out.println("avg :"+res[4]);*/
		
		//Subquery ================================
		System.out.println("=======subquery =======");
		Actor actor=repo.findActorMaxAid();
		System.out.println(actor);
		
	}
}
