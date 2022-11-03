package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	
	@Autowired
	@Qualifier("engType")
	private Engine engine;
	
	
	public void journy(String startPlace,String endPlace) {
		engine.start();
		System.out.println("Engine started from "+startPlace);
		System.out.println("Engine is going on");
		engine.stop();
		System.out.println("Engine Stopped at "+endPlace);
		
	}
}
