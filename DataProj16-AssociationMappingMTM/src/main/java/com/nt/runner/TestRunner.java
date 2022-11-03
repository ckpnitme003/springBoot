package com.nt.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.entity.Patient;
import com.nt.service.IDoctorMgmtService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IDoctorMgmtService service;

	@Override
	public void run(String... args) throws Exception {

		//Doctors=============
			Doctor d1=new Doctor();
			d1.setDname("Raju");
			d1.setHospital("Appolo");
			Doctor d2=new Doctor();
			d2.setDname("Ramesh");
			d2.setHospital("Appolo");
			//patients
			Patient p1=new Patient();
			p1.setPatName("ramu");
			p1.setProblem("lung");
		//		p1.setDoc(Set.of(d1,d2));
			//===========
			Patient p2=new Patient();
			p2.setPatName("yuti");
			p2.setProblem("corona");
		//		p2.setDoc(Set.of(d2));
			
			d1.setPat(Set.of(p1,p2));
			d2.setPat(Set.of(p1));
			
			String msg1=service.saveDataByDoctor(Set.of(d1,d2));
			System.out.println(msg1);

		/*//Doctors=============
			Doctor d1=new Doctor();
			d1.setDname("Raju");
			d1.setHospital("Appolo");
			Doctor d2=new Doctor();
			d2.setDname("Ramesh");
			d2.setHospital("Appolo");
			//patients
			Patient p1=new Patient();
			p1.setPatName("kk");
			p1.setProblem("Heart");
			p1.setDoc(Set.of(d1,d2));
			//===========
			Patient p2=new Patient();
			p2.setPatName("ll");
			p2.setProblem("corona");
			p2.setDoc(Set.of(d2));
			
			d1.setPat(Set.of(p1,p2));
			d2.setPat(Set.of(p1));
			
			String msg2=service.saveDataByPatient(Set.of(p1,p2));
			System.out.println(msg2);*/
	}

}
