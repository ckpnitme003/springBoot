package com.nt.bean;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")

public class Flipkart {
	//HAS-A (dependent class)
	@Autowired
	@Qualifier("courier")
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart - 0 param constructor");
	}
	
	public String order(String pname[],double price[]) {
		double billAmt=0.0;
		for(double b:price) {
			billAmt=billAmt+b;
		}
		int oid=new Random().nextInt(1000);
		return Arrays.toString(pname)+" is products of bill amt is :"+billAmt+" ---- "+courier.deliver(oid);
	}
}
