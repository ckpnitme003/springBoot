package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@GetMapping("/")
	public String showHome() {
		System.out.println("show home method");
		return "welcome";
	}
	@GetMapping("/report")
	public String showReport(@RequestParam("type")String type) {
		System.out.println("show Report method");
		if(type.equals("pdf"))
			return "pdf_result";
		else
			return "excel_result";
	}
	
}
