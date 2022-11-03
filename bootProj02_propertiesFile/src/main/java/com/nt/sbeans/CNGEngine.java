package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("cngEng")
public class CNGEngine implements Engine {
	
	public CNGEngine() {
		System.out.println("CNG engine -0 param constructor");
	}
	@Override
	public void start() {
		System.out.println("CNG Engine started");
	}
	@Override
	public void stop() {
		System.out.println("CNG Engine stopped");
	};
}
