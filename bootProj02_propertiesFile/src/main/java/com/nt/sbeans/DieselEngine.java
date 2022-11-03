package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dEng")
public class DieselEngine implements Engine {
	
	public DieselEngine() {
		System.out.println("diesel engine -0 param constructor");
	}
	@Override
	public void start() {
		System.out.println("diesel Engine started");
	}
	@Override
	public void stop() {
		System.out.println("diesel Engine stopped");
	};
}
