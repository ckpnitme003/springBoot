package com.nt.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Person;
import com.nt.repository.IPersonRepo;

@Component
public class PersonRunner implements CommandLineRunner {
	
	@Autowired
	private IPersonRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		//save operation=============================
		Scanner scn=new Scanner(System.in);
		
		System.out.println("enter person Name :");
		String Name=scn.nextLine();
		System.out.println("enter path of photo :");
		String photoName=scn.nextLine().trim();
		System.out.println("enter path of resume :");
		String resumeName=scn.nextLine().trim();
		Person p=new Person();
		p.setName(Name);
		try {
		
			
			File photoFile=new File(photoName);
			FileInputStream fis=new FileInputStream(photoFile);
			byte[] photoContent=new byte[(int) photoFile.length()];
			fis.read(photoContent);
			p.setPhotoContent(photoContent);
			
		
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		try {
			
			File resumeFile=new File(resumeName);
			FileReader reader=new FileReader(resumeFile);
			char[] resumeContent=new char[(int)resumeFile.length()];
			reader.read(resumeContent);
			p.setResumeContent(resumeContent);
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		Person per = repo.insert(p);
		System.out.println(per.getId()+" is saved ");
		
		
		//select=======================================
		/*Optional<Person> opt=repo.findById("631b643a0900f44d63eba135");
		if(opt.isPresent()) {
			Person per=opt.get();
			System.out.println(per.getId()+" "+per.getName());
			byte[] photoContent=per.getPhotoContent();
			char[] resumeContent=per.getResumeContent();
			
			OutputStream os=new FileOutputStream("new_Img1.jpg");
			os.write(photoContent);
			os.close();
			
			FileWriter fw=new FileWriter("resume.txt");
			fw.write(resumeContent);
			fw.close();
		}*/
	}
}
