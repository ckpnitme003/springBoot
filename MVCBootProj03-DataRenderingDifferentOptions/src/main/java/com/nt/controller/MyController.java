package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Employee;

@Controller
public class MyController {
	
	//passing simple value to view component
	/*@GetMapping("/report")
	public String showReport(Map<String,Object> map) {
		
		System.out.println("report method");
		//set simple property to model attribute
		map.put("name", "chandan");
		map.put("age", 26);
		
		//return LVN
		return "show_data1";
	}*/
	/*//passing Collection of value to view component
	@GetMapping("/report")
	public String showReport(Map<String,Object> map) {
		
		System.out.println("report method");
		//set simple property to model attribute
		map.put("favcolor",new String[] {"red","green","blue"});
		map.put("friends",List.of("Pk","BK","Hk"));
		map.put("contact",Set.of( 9999827l,8288821l));
		map.put("idDetails",Map.of("aadhar",92889392,"voter",92882922));
		
		//return LVN
		return "show_data2";
	}*/
	/*//passing ModelClass object to view component
	@GetMapping("/report")
	public String showReport(Map<String,Object> map) {
		
		System.out.println("report method");
		//set simple property to model attribute
		Employee emp=new Employee(101,"HK",20000.0,true);
		map.put("empInfo", emp);
		//return LVN
		return "show_data3";
	}*/
	//passing collection of ModelClass object to view component
	@GetMapping("/report")
	public String showReport(Map<String,Object> map) {
		
		System.out.println("report method");
		//set simple property to model attribute
		List<Employee> li=List.of(new Employee(101,"HK",20000.0,true),
								  new Employee(102,"BK",30000.0,true),
								  new Employee(103,"CK",40000.0,true));
		map.put("empDetails", li);
		//return LVN
		return "show_data4";
	}
}
