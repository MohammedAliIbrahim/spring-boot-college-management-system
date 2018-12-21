package com.cms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cms.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	Student findById(int id); 

}
