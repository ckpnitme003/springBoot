package com.nt.controller;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import com.nt.service.ILinkService;
import com.nt.service.LinkServiceMgmt;

public class Linkhandler {
	
	private ILinkService service;
	
	public Linkhandler() {
		service=new LinkServiceMgmt();
	}
	public String showWishMsg(HttpServletRequest req) {
		
		String wishMsg=service.getWishMsg();
		req.setAttribute("msg", wishMsg);
		//return logical view name
		return "wish_msg";
		
	}
	public String showAllLanguage(HttpServletRequest req) {
		Set<String> lang=service.fetchLang();
		req.setAttribute("allLang", lang);
		
		//return logical view name
		return "all_lang";
	}
	
}
