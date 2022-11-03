package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.service.IActorMgmtService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IActorMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		/*
				try {
		//			Iterable<Actor> itr=service.ShowAllActorBySorted(true, "aid");
		//			Iterable<Actor> itr=service.ShowAllActorBySorted(false, "aid");
					Iterable<Actor> itr=service.ShowAllActorBySorted(true, "aname","aid");
					itr.forEach(p->System.out.println(p));
					
				}catch(DataAccessException dae) {
					dae.printStackTrace();
				}*/
		/*	try {
				Page<Actor> page=service.ShowSinglePage(1, 3);
				
				List<Actor> li=page.getContent();
				
				li.forEach(p->System.out.println(p));
				
				//page details
				System.out.println("Page number :"+page.getNumber());
				System.out.println("Total number of elements :"+page.getTotalElements());
				System.out.println("Total number of pages :"+page.getTotalPages());
				System.out.println("Is first page :"+page.isFirst());
				System.out.println("Is last page :"+page.isLast());
				
			}catch(DataAccessException dae) {
				dae.printStackTrace();
			}*/
		/*		try {
					Page<Actor> page=service.ShowSinglePageSorted(1, 3,true);
					
					List<Actor> li=page.getContent();
					
					li.forEach(p->System.out.println(p));
					
					//page details
					System.out.println("Page number :"+page.getNumber());
					System.out.println("Total number of elements :"+page.getTotalElements());
					System.out.println("Total number of pages :"+page.getTotalPages());
					System.out.println("Is first page :"+page.isFirst());
					System.out.println("Is last page :"+page.isLast());
					
				}catch(DataAccessException dae) {
					dae.printStackTrace();
				}*/
				try {
					service.ShowActorByPage(3);
				}catch(DataAccessException dae) {
					dae.printStackTrace();
				}
	}
}
