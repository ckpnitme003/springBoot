package com.nt.runner;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;



@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private EntityManager manager;

	@Override
	public void run(String... args) throws Exception {
		
		//create stored procedure query object
		StoredProcedureQuery query=manager.createStoredProcedureQuery("P_GET_ACTOR_BY_CATEGORY", Actor.class);
		
		//register both in out param of PL/SQL
		
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, Actor.class, ParameterMode.REF_CURSOR);
		
		query.setParameter(1, "Hero");
		query.setParameter(2, "Heroin");
		
		List<Actor> li=query.getResultList();
		li.forEach(p->System.out.println(p));
				
		
	}
}
