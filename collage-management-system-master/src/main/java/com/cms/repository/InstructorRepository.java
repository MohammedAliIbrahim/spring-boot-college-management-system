package com.cms.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.cms.entity.Instructor;

@Repository
public interface InstructorRepository extends CrudRepository<Instructor, Integer>{

	
	Instructor findById(int id) ;

	
//	Instructor findOne(int id) ; 
	
}
