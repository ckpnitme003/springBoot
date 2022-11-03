package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMsgGenerator {
	
	//local date time as Has-A property
	@Autowired
	private LocalDateTime ldt;
	
	//b.method
	public String getMsg(String user) {
		int hour=ldt.getHour();
		if(hour<12)
			return "Good Morning "+user;
		else if(hour<16)
			return "Good Afternoon "+user;
		else if(hour<20)
			return "Good Evening "+user;
		else 
			return "Good Night "+user;
	}
}
