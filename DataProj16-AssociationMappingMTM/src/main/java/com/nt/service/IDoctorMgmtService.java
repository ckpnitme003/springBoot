package com.nt.service;

import java.util.Set;

import com.nt.entity.Doctor;
import com.nt.entity.Patient;

public interface IDoctorMgmtService {

	public String saveDataByDoctor(Set<Doctor> docSet);
	public String saveDataByPatient(Set<Patient> patSet);
}
