package com.nt.service;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class LinkServiceMgmt implements ILinkService {

	@Override
	public String getWishMsg() {
		
		LocalDateTime ldt=LocalDateTime.now();
		int hour=ldt.getHour();
		if(hour<12)
			return "Good Morning";
		else if(hour<16)
			return "Good Afternoon";
		else if(hour<20)
			return "Good evening";
		else
			return "Good Night";
	}

	@Override
	public Set<String> fetchLang() {
		
		Set<String> lang=new HashSet<>();
		
		Locale[] locales=Locale.getAvailableLocales();
		for(Locale l:locales) {
			lang.add(l.getLanguage());
		}
		return lang;
	}

}
