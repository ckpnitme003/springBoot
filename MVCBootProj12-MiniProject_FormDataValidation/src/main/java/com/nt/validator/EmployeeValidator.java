package com.nt.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.model.Employee;

//this class is one per model class
@Component
public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(Employee.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		//typecating to Employee
		Employee e=(Employee)target;
		
		//form validation logic
		//for ename============
		if(e.getEname().isBlank())
			errors.rejectValue("ename", "emp.ename.required");
		else if(e.getEname().length()<5 ||e.getEname().length()>=10)
			errors.rejectValue("ename", "emp.ename.length");
		
		//for eaddr================
		if(e.getEaddr().isBlank())
			errors.rejectValue("eaddr", "emp.addrs.required");
		else if(e.getEaddr().length()<5 ||e.getEname().length()>=15)
			errors.rejectValue("eaddr", "emp.addrs.length");
		//for job================
		if(e.getJob().isBlank())
			errors.rejectValue("job", "emp.job.required");
		//for sal================
		if(!errors.hasFieldErrors("sal")) {
			if(e.getSal()==null)
				errors.rejectValue("sal", "emp.sal.required");
			else if(e.getSal()<10000 || e.getSal()>200000)
				errors.rejectValue("sal", "emp.sal.numeric");
		}
	}

}
