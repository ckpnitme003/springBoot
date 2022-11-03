package com.nt.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.PassportDetails;

public interface IPassportRepo extends JpaRepository<PassportDetails, Integer>{
	

	
}
