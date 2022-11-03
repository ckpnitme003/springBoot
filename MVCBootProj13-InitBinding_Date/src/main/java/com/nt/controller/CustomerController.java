package com.nt.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Customer;

@Controller
public class CustomerController {
	
	@GetMapping("/")
	public String showHomePage() {
		return "welcome";
	}
	@GetMapping("/cust_register")
	public String showFormPage(@ModelAttribute("cust")Customer cust) {
		return "show_form_page";
	}
	@PostMapping("/cust_register")
	public String showResultPage(@ModelAttribute("cust")Customer cust,Map<String,Object> map) {
		
		map.put("custData", cust);
		return "show_result_page";
		
	}
	@InitBinder
	public void myBinder(ServletRequestDataBinder binder) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
		
	}
	
}
