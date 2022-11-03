package com.nt.bean;

import org.springframework.stereotype.Component;

@Component("bDart")
public class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("bDart 0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		return oid+" is deliver using BlueDart courier service";
	}
}
