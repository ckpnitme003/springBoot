package com.nt.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.entity.Student;

@Component
public class StudentValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(Student.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		Student st=(Student)target;
		
		//for sname===
		if(st.getSname().isBlank())
			errors.rejectValue("sname", "st.sname.required");
		
		//for password ===
		if(st.getPwd().isBlank())
			errors.rejectValue("pwd", "st.pwd.required");

		//for  language===
		if(st.getLang().size()==0)
			errors.rejectValue("lang", "st.lang.required");
		
		//for  language===
		if(st.getHobbies().length==0)
			errors.rejectValue("hobbies", "st.hobbies.required");
		
	}

}
