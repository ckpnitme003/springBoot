package com.nt.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.entity.Patient;
import com.nt.repository.IDoctorRepo;
import com.nt.repository.IPatientRepo;

@Service("doctorMgmtService")
public class DoctorMgmtServiceImpl implements IDoctorMgmtService {

	@Autowired
	private IDoctorRepo docRepo;
	
	@Autowired
	private IPatientRepo patRepo;
	
	
	@Override
	public String saveDataByDoctor(Set<Doctor> docSet) {
		List<Doctor> li=docRepo.saveAll(docSet);
		
		return li.size()+" number of doctors record is inserted .";
	}
	@Override
	public String saveDataByPatient(Set<Patient> patSet) {
		List<Patient> li=patRepo.saveAll(patSet);
		
		return li.size()+" number of patients record is inserted .";
	}
}
