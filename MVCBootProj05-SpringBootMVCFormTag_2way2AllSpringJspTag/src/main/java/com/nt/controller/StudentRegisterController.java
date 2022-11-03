package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Student;

@Controller
public class StudentRegisterController {
	
	@GetMapping("/")
	public String showHome() {
		return "welcome";
	}
	@GetMapping("/register")
	public String showFormPage(@ModelAttribute("stud")Student st) {
			
		System.out.println("StudentRegisterController.showFormPage()");
		return "show_form";
	}
	@PostMapping("/register")
	public String processStudent(Map<String,Object> map,@ModelAttribute("stu")Student st) {
		
		System.out.println("StudentRegisterController.processStudent()");
		
		System.out.println(st);
		map.put("result", st);
		
		
		return "show_result";
	}
}
