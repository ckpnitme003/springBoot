package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.PhoneNumber;

public interface IPhoneNumberRepo extends MongoRepository<PhoneNumber, Integer> {

}
