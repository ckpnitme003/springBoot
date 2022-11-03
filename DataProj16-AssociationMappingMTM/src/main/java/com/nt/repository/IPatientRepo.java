package com.nt.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Patient;

public interface IPatientRepo extends JpaRepository<Patient, Integer>{
	

	
}
