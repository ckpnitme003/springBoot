package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private IEmployeeService service;
	
	@GetMapping("/")
	public String showHome() {
		//return LVN
		return "welcome";
	}
	/*@GetMapping("/emp_report")	
	public String showAllEmp(Map<String,Object> map) {
		System.out.println("showAllEmp() in controller");
		List<Employee> empLi=(List<Employee>)service.getAllEmp();
		System.out.println(empLi);
		map.put("empList", empLi);
		return "show_all_employee";
	}*/
	@GetMapping("/emp_insert")
	public String showRegisterPage(@ModelAttribute("emp")Employee e) {
		System.out.println("EmployeeController.showRegisterPage()");
		return "show_register_employee";
	}

	/*@PostMapping("/emp_insert")
	public String insertRecord(Map<String,Object> map,@ModelAttribute("emp")Employee emp) {
		System.out.println("EmployeeController.insertRecord()");
		Employee e=service.registerEmp(emp);
		System.out.println(e);
		map.put("emp1", e);
		return "show_register_result";
	}*/
	/*//to solve double posting problem
	@PostMapping("/emp_insert")
	public String insertRecord(Map<String,Object> map,@ModelAttribute("emp")Employee emp) {
		System.out.println("EmployeeController.insertRecord()");
		Employee e=service.registerEmp(emp);
		System.out.println(e);
		map.put("resultMsg", e.getEno()+" is saved successfully");
		return "redirect:emp_report";
	}*/
		//to solve double posting problem(I)
		@PostMapping("/emp_insert")
		public String insertRecord(RedirectAttributes attrs,@ModelAttribute("emp")Employee emp) {
			System.out.println("EmployeeController.insertRecord()");
			Employee e=service.registerEmp(emp);
			System.out.println(e);
			attrs.addFlashAttribute("resultMsg", e.getEno()+" is saved successfully");
			return "redirect:emp_report";
		}
	/*//to solve double posting problem(II)
	@PostMapping("/emp_insert")
	public String insertRecord(HttpSession ses,@ModelAttribute("emp")Employee emp) {
		System.out.println("EmployeeController.insertRecord()");
		Employee e=service.registerEmp(emp);
		System.out.println(e);
		ses.setAttribute("resultMsg", e.getEno()+" is saved successfully");
		return "redirect:emp_report";
	}*/
	@GetMapping("/edit")
	public String ShowUpdatePage(@RequestParam Integer eno,@ModelAttribute("Emp")Employee emp1) {
		System.out.println("EmployeeController.ShowUpdatePage()");
		Employee em=service.GetEmp(eno);
		/*	emp1.setEno(em.getEno());
			emp1.setEname(em.getEname());
			emp1.setEaddr(em.getEaddr());
			emp1.setJob(em.getJob());
			emp1.setSal(em.getSal());*/
		//copy to modelAttribute
		BeanUtils.copyProperties(em, emp1);
		return "show_edit";
	}

	/*@PostMapping("/edit")
	public String updateRecord(Map<String,Object> map,@ModelAttribute("emp")Employee e){
		System.out.println("EmployeeController.updateRecord()");
		Employee em=service.updateEmp(e);
		map.put("emmp", em);
		return "show_edit_result";
	}*/
	@PostMapping("/edit")
	public String updateRecord(RedirectAttributes attrs,@ModelAttribute("emp")Employee e){
		System.out.println("EmployeeController.updateRecord()");
		Employee em=service.updateEmp(e);
		attrs.addFlashAttribute("resultMsg", em.getEno()+" is updated successfully");
		return "redirect:emp_report";
	}
	@GetMapping("/delete")
	public String ShowUpdatePage(@RequestParam Integer eno,RedirectAttributes attrs) {
		System.out.println("EmployeeController.ShowUpdatePage()");
		String result=service.deleteEmp(eno);
		attrs.addFlashAttribute("resultMsg", result);
		return "redirect:emp_report";
	}
	@GetMapping("/pageWise")	
	public String showEmpPageWise(Map<String,Object> map,@RequestParam(name = "no",defaultValue ="0")int no) {
		System.out.println("showEmpPageWise() in controller");
		List<Employee> empLi=(List<Employee>)service.getEmpByPageNo(no);
		System.out.println(empLi);
		map.put("empList", empLi);
		//get number of page 
		List<Employee> li=(List<Employee>)service.getAllEmp();
		int pageCount=li.size()/3;
		pageCount=li.size()%3==0?pageCount:pageCount+1;
		System.out.println(pageCount);
		map.put("pageCount", pageCount);
		return "show_emp_page";
	}
	@GetMapping("/emp_report")	
	public String showAllEmp(@PageableDefault(page = 0,size = 3,sort = "eno",direction =Direction.ASC)Pageable pageable ,Map<String,Object> map) {
		System.out.println("showAllEmp() in controller");
		
		Page<Employee> page=service.getEmpsByPage(pageable);
		map.put("empData", page);
		return "show_all_employee";
	}
}
