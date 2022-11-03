package com.nt.dao;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Student;

public interface IStudentDao extends CrudRepository<Student, Integer>{

}
