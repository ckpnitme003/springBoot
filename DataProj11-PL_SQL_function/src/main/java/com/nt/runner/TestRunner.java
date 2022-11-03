package com.nt.runner;



import java.sql.CallableStatement;
import java.sql.ResultSet;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.dialect.OracleTypesHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import oracle.jdbc.internal.OracleTypes;




@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private EntityManager manager;

	@Override
	public void run(String... args) throws Exception {
		
		//getSession
		Session ses=manager.unwrap(Session.class);
		
		//use Work(I) and Callable(I) to get Connection Object
		ses.doWork(con-> {
				CallableStatement cs=con.prepareCall("{?=call FX_GET_ACTOR_DATA_BY_MOB(?,?)}");
				
				//register out param
				cs.registerOutParameter(1,OracleTypes.CURSOR);
				
				cs.setLong(2,948339292l);
				cs.setLong(3,938992l);
				
				cs.execute();
				
				ResultSet rs=(ResultSet)cs.getObject(1);
				
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				}//while
		});
				
		
	}
}
