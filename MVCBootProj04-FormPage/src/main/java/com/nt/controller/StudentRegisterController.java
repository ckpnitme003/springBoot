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
	public String showFormPage() {
		return "show_form";
	}
	@PostMapping("/register")
	public String processStudent(Map<String,Object> map,@ModelAttribute("stud")Student st) {
		
		String grad=null;
		if(st.getAvg()>=75)
			grad="First division with dest";
		else if(st.getAvg()>=60)
			grad="First division";
		else if(st.getAvg()>=50)
			grad="Second division ";
		else if(st.getAvg()>=35)
			grad="Third division";
		else 
			grad="Fail";
		
		//kept result in BindingAwareModelMap
		map.put("result", grad);
		
		return "show_result";
	}
}
