package com.nt.bean;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courier {
	public DTDC() {
		System.out.println("DTDC 0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		return oid+" is deliver using DTDC courier service";
	}
}
