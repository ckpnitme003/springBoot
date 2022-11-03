package com.nt.controller;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	/*@GetMapping("/data")
	public String process(@RequestParam("sno")int no,@RequestParam("sname")String name) {
		System.out.println(no+"====="+name);
		
		return "show_result";
	}*/
	/*@GetMapping("/data")
	public String process(@RequestParam int sno,@RequestParam String sname) {
		System.out.println(sno+"====="+sname);
		
		return "show_result";
	}*/
	/*@GetMapping("/data")
	public String process(@RequestParam int sno,@RequestParam(required = false) String name) {
		System.out.println(sno+"====="+name);
		
		return "show_result";
	}*/
	/*@GetMapping("/data")
	public String process(@RequestParam int sno,@RequestParam(defaultValue = "BK") String name) {
		System.out.println(sno+"====="+name);
		
		return "show_result";
	}*/
	/*@GetMapping("/data")
	public String process(@RequestParam(required = false) Integer no,@RequestParam(defaultValue = "BK") String name) {
		System.out.println(no+"====="+name);
		
		return "show_result";
	}*/
	/*@GetMapping("/data")
	public String process(@RequestParam(defaultValue = "222") Integer no,@RequestParam(defaultValue = "BK") String name) {
		System.out.println(no+"====="+name);
		
		return "show_result";
	}*/
	@GetMapping("/data")
	public String process(@RequestParam(name = "sno") Integer no,
						  @RequestParam("sname") String name,
						  @RequestParam("sadd") String add[],
						  @RequestParam("sadd") List<String> addList,
						  @RequestParam("sadd") Set<String> addSet,
						  @RequestParam("sadd") String address
						  
						  ) {
		System.out.println("Sno :"+no);
		System.out.println("Sname :"+name);
		System.out.println("Arrays All Address :"+add);
		System.out.println("List All Address :"+addList);
		System.out.println("Set All Address :"+addSet);
		System.out.println("String All Address :"+address);
		
		
		return "show_result";
	}
}
