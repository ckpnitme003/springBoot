package com.nt.runner;

import java.io.FileOutputStream;
import java.io.FileWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.PersonInfo;
import com.nt.service.IPersonMgmtService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IPersonMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		
		/*	Scanner scn=new Scanner(System.in);
			
			System.out.print("Enter person name :");
			String name=scn.nextLine();
			
			System.out.print("Enter person marital status :");
			boolean ms=scn.nextBoolean();
			scn.nextLine();
			
			System.out.print("Enter person DOB(yyyy-MM-ddThh:mm:ss) :");
			String dob=scn.nextLine();
			
			System.out.print("Enter person Image path :");
			String imgPath=scn.nextLine().trim();
			
			System.out.print("Enter person resume path :");
			String resumePath=scn.nextLine().trim();
			
			
			//convert String time to LocalDateTime
			LocalDateTime ldt=LocalDateTime.parse(dob);
			
			//Image path to store into byte[] 
			File f1=new File(imgPath);
			FileInputStream fis=new FileInputStream(f1);
			byte[] ImgContent=new byte[(int) f1.length()];
			fis.read(ImgContent);
			
			//Resume path to store into char[] 
			File f2=new File(resumePath);
			FileReader fw=new FileReader(f2);
			char[] resumeContent=new char[(int) f2.length()];
			fw.read(resumeContent);
			
				//save person info
				PersonInfo p=new PersonInfo();
				p.setPname(name);
				p.setMaritalStatus(ms);
				p.setDob(ldt);
				p.setImages(ImgContent);
				p.setResumes(resumeContent);
				
				
				String msg=service.registerPerson(p);
				System.out.println(msg);*/
		
		//select person by Id
		PersonInfo per=service.getPersonById(61);
		
		System.out.println(per.getPid()+" "+per.getPname()+" "+per.getMaritalStatus()+" "+per.getDob());
		
		byte[] imgContent=per.getImages();
		char[] resumeContent=per.getResumes();
		
		FileOutputStream fos=new FileOutputStream("new_Img.jpg");
		fos.write(imgContent);
		fos.close();
		
		FileWriter fw=new FileWriter("new_Resume.txt");
		fw.write(resumeContent);
		fw.close();
		
		
	}
	
}
