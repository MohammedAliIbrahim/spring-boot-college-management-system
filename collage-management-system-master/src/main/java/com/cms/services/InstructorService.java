package com.cms.services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.entity.Instructor;
import com.cms.repository.InstructorRepository;

@Service
public class InstructorService {

	@Autowired InstructorRepository instructorRepository;
	
	//create instructor
	public void createInstructor(Instructor instructor) {
		instructorRepository.save(instructor) ; 
	}


	public Instructor  getInstructorProfile(int id) {
		// TODO Auto-generated method stub
		return instructorRepository.findById(id);
	}


	public List<Instructor> getListOfInstructors() {
		List<Instructor>  instructors = new ArrayList<>();
//		System.out.println(instructors.size());
		instructors=(List<Instructor> )instructorRepository.findAll();
		//.forEach(instructors::add);
		System.out.println(instructors.size());
		return instructors;
	}


	public Instructor editInstructor(int id) {
		// TODO Auto-generated method stub
		return instructorRepository.findById(id) ; 
	}
	
	
}
