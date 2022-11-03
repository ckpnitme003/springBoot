package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEng")
public class PetrolEngine implements Engine {
	
	public PetrolEngine() {
		System.out.println("petrol engine -0 param constructor");	
	}
	@Override
	public void start() {
		System.out.println("petrol Engine started");
	}
	@Override
	public void stop() {
		System.out.println("petrol Engine stopped");
	};
}
