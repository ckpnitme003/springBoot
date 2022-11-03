package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.service.ISeasonService;

@Controller
@RequestMapping("/seasonController")
public class MySeasonController {

	@Autowired
	private ISeasonService service;
	/*
//		@RequestMapping("/")
		@RequestMapping
		public String showHome() {
			System.out.println("home page");
			return "welcome";
		}
		@RequestMapping("/season")
		public String showHome(Map<String,Object> map) {
			System.out.println("season page");
			map.put("checkSeason", service.getSession());
			return "season_data";
		}*/
	
	/*	@RequestMapping("/report")
		public String showReport() {
			return "show_report";
		}
		@RequestMapping("/REPORT")
		public String showReport1() {
			return "show_report1";
		}*/
	/*@RequestMapping({"/report1","/report2","/report3"})
	public String showReport() {
		return "show_report";
	}*/
	
	/*	@RequestMapping("/")
		public String showHome() {
			System.out.println("home page");
			return "welcome";
		}
	//	@RequestMapping(value="/report",method = RequestMethod.GET)
		@GetMapping("/report")
		public String showReport() {
			System.out.println("get mode");
			return "show_report";
		}
	//	@RequestMapping(value="/report",method = RequestMethod.POST)
		@PostMapping("/report")
		public String showReport1() {
			System.out.println("post mode");
			return "show_report1";
		}
		*/
	/*//same request path and same mode(Exception case)	
	@GetMapping("/report")
	public String showReport1() {
		System.out.println("post mode");
		return "show_report";
	}
	@GetMapping("/report")
	public String showReport2() {
		System.out.println("post mode");
		return "show_report1";
	}*/
	/*	// same request path and same mode in different controller(global request mappin path)	
		@GetMapping("/all")
		public String showReport1() {
			System.out.println("Get mode");
			return "show_report";
		}*/
	
	@GetMapping("/")
	public String showReport1() {
		System.out.println("Get mode");
		return "forward:/test/all";
//		return "redirect:/test/all";
	}
	

}
