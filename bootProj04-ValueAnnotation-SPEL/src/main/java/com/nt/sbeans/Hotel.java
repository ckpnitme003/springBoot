package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotel")
public class Hotel {
	
	@Value("1011")
	private Integer Id;
	
	@Value("${hotel.name}")
	private String hotelName;
	
	@Value("${hotel.addrs}")
	private String hotelAddrs;
	
	@Value("#{menup.doshaprice+menup.idlyprice}")
	private Float billAmount;

	@Override
	public String toString() {
		return "Hotel [Id=" + Id + ", hotelName=" + hotelName + ", hotelAddrs=" + hotelAddrs + ", billAmount="
				+ billAmount + "]";
	}
	
	
}
