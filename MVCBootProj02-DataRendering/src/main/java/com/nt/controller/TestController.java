package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
	
	// same request path and same mode in different controller(global request mappin path)	
		@GetMapping("/all")
		public String showReport1() {
			System.out.println("Get mode");
			return "show_report";
		}
}
