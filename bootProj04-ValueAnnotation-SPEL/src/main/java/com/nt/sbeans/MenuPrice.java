package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("menup")
@Data
public class MenuPrice {
	
	@Value("${menu.dosharate}")
	private Float doshaprice;
	
	@Value("${menu.idlyrate}")
	private Float idlyprice;
	
	@Value("${menu.phoharate}")
	private Float phohaprice;
	
	@Value("${menu.rotirate}")
	private Float rotiprice;
	
}
