package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;
import com.nt.validator.EmployeeValidator;

@Controller
public class EmployeeController {
	
	@Autowired
	private IEmployeeService service;
	
	@Autowired
	private EmployeeValidator empvalidator;
	
	@GetMapping("/")
	public String showHome() {
		//return LVN
		return "welcome";
	}
	@GetMapping("/emp_report")	
	public String showAllEmp(Map<String,Object> map) {
		System.out.println("showAllEmp() in controller");
		List<Employee> empLi=(List<Employee>)service.getAllEmp();
		System.out.println(empLi);
		map.put("empList", empLi);
		return "show_all_employee";
	}
	@GetMapping("/emp_insert")
	public String showRegisterPage(@ModelAttribute("emp")Employee e) {
		System.out.println("EmployeeController.showRegisterPage()");
		return "show_register_employee";
	}

	@PostMapping("/emp_insert")
	public String insertRecord(RedirectAttributes attrs,
			@ModelAttribute("emp")Employee emp,
			BindingResult errors) {

		//use validation===
		if(!emp.getIsVerified()) {
		if(empvalidator.supports(Employee.class)) {
			empvalidator.validate(emp, errors);
			
			//application logic errors
			if(service.isJobInRejectionList(emp.getJob()))
				errors.rejectValue("job", "emp.job.reject");
			
			if(errors.hasErrors())
				return "show_register_employee";
		}
		}
		System.out.println("EmployeeController.insertRecord()");
		Employee e=service.registerEmp(emp);
		System.out.println(e);
		attrs.addFlashAttribute("resultMsg", e.getEno()+" is saved successfully");
		return "redirect:emp_report";
	}

	@GetMapping("/edit")
	public String ShowUpdatePage(@RequestParam Integer eno,@ModelAttribute("emp")Employee emp1) {
		System.out.println("EmployeeController.ShowUpdatePage()");
		Employee em=service.GetEmp(eno);

		//copy to modelAttribute
		BeanUtils.copyProperties(em, emp1);
		return "show_edit";
	}

	@PostMapping("/edit")
	public String updateRecord(RedirectAttributes attrs,
								@ModelAttribute("emp")Employee e,
								BindingResult errors){
		
		System.out.println("EmployeeController.updateRecord()");
		//use validation===
		if(empvalidator.supports(Employee.class)) {
			empvalidator.validate(e, errors);
			if(errors.hasErrors())
				return "show_edit";
		}
		
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
	@ModelAttribute("deptNoInfo")
	public List<Integer> refDataForDeptNo(){
		System.out.println("=======EmployeeController.refDataForDeptNo()========");
		return service.fetchAllDeptNo();
	}
}
