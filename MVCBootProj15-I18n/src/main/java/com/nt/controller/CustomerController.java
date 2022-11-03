package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.nt.model.Customer;

@Controller
public class CustomerController {

	@GetMapping("/")
	public String showHomePage() {
		return "welcome";
	}
	@GetMapping("/register")
	public String showRegisterPage(@ModelAttribute("cust")Customer cust,Map<String,Object> map) {
		return "show_register";
	}
}
