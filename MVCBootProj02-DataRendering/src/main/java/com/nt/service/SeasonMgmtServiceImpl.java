package com.nt.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class SeasonMgmtServiceImpl implements ISeasonService {

	@Override
	public String getSession() {
		LocalDate ld=LocalDate.now();
		int month=ld.getMonthValue();
		if(month>=7 &&month<=9)
			return "Rainy Season";
		else if(month>=3&&month<6)
			return "summer season";
		else
			return "winter";
	}

}
