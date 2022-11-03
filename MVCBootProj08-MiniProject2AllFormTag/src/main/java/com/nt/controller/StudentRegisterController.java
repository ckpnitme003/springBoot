package com.nt.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.entity.Student;
import com.nt.model.StudentInfo;
import com.nt.service.IStudentService;
import com.nt.validator.StudentValidation;

@Controller
public class StudentRegisterController {
	
	@Autowired
	private IStudentService service;
	
	@Autowired
	private StudentValidation studValidator;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/")
	public String showHome() {
		return "welcome";
	}
	@GetMapping("/select")
	public String showAllRecordPage(Map<String,Object> map) {
		System.out.println("StudentRegisterController.showAllRecordPage()");
		List<Student> li=service.getAllStud();
		map.put("allStud", li);
		return "show_all";
	}
	@GetMapping("/register")
	public String showFormPage(@ModelAttribute("stud")StudentInfo st) {
			
		System.out.println("StudentRegisterController.showFormPage()");
		return "show_form";
	}
	@PostMapping("/register")
	public String processStudent(Map<String,Object> map,
								@ModelAttribute("stud")StudentInfo st,
								RedirectAttributes attrs,
								BindingResult errors) throws IOException {
		
		System.out.println("StudentRegisterController.processStudent()");
		//validation======
		/*if(studValidator.supports(Student.class)) {
			studValidator.validate(st, errors);
			if(errors.hasErrors())
				return "show_form";
		}
		System.out.println(st);*/
		
		//keep files in server machine file system
		String uploadPath=env.getProperty("upload.path");
		
		MultipartFile file1=st.getResume();
		MultipartFile file2=st.getPhoto();
		
		InputStream is1=file1.getInputStream();
		InputStream is2=file2.getInputStream();
		
		String fileName1=file1.getOriginalFilename();
		String fileName2=file2.getOriginalFilename();
		
		File storeFolder=new File(uploadPath);
		if(!storeFolder.exists())
			storeFolder.mkdir();
		
		OutputStream os1=new FileOutputStream(uploadPath+"/"+fileName1);
		OutputStream os2=new FileOutputStream(uploadPath+"/"+fileName2);
		
		is1.transferTo(os1);
		is2.transferTo(os2);
		
		is1.close();
		is2.close();
		os1.close();
		os2.close();
		
		//transer data from model to entity
		Student s=new Student();
		s.setSname(st.getSname());
		s.setEmail(st.getEmail());
		s.setDob(st.getDob());
		s.setPwd(st.getPwd());
		s.setMs(st.getMs());
		s.setHobbies(st.getHobbies());
		s.setLang(st.getLang());
		s.setGender(st.getGender());
		s.setEducation(st.getEducation());
		s.setNotes(st.getNotes());
		s.setPhotoPath(uploadPath+"/"+fileName1);
		s.setResumePath(uploadPath+"/"+fileName2);
		
		String res=service.registerStud(s);

		attrs.addFlashAttribute("result",res);
		
		return "redirect:select";
	}
	@GetMapping("/edit")
	public String showFormPageForEdit(@ModelAttribute("stud")Student st,@RequestParam("sno")Integer sno) {
		Student s=service.getStud(sno);
		
		//copy the data to modelAttribue
		BeanUtils.copyProperties(s, st);
		
		System.out.println("StudentRegisterController.showFormPage()");
		return "show_form_edit";
	}
	@PostMapping("/edit")
	public String processStudentForEdit(Map<String,Object> map,@ModelAttribute("stu")Student st,RedirectAttributes attrs) {
		
		System.out.println("StudentRegisterController.processStudent()");
		
		System.out.println(st);
		String res=service.updateStud(st);
		
		attrs.addFlashAttribute("result",res);
		
		return "redirect:select";
	}
	@ModelAttribute("hobiesInfo")
	public List<String> gethobies(){
		List<String> li=List.of("Playing Games","Watching Movies","Reading Books","Traveling");
		return li;
	}
	@ModelAttribute("genderInfo")
	public List<String> getGenderInfo(){
		List<String> li=List.of("Male","FeMale");
		return li;
	}
}
