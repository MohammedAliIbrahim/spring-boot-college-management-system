package com.cms.RestControllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cms.entity.Instructor;

import com.cms.services.InstructorService;

@RestController
@RequestMapping("/instructors")
public class RestInstructorProfileController {

	@Autowired
	InstructorService instructorService;

	
	
	@PostMapping("/create-profile")
	public void createInstructor(Instructor instructor) {
		instructorService.createInstructor(instructor);
	}

	@RequestMapping("/list/{id}")
	public Instructor getInstructorProfile(@PathVariable int id) {
		// TODO Auto-generated method stub
		return instructorService.getInstructorProfile(id);
	}

	
	@GetMapping("/list")
	public  List<Instructor> getList(){		
		List<Instructor>  instructors = instructorService.getListOfInstructors() ; 
		System.out.println("s= "+instructors.size());
		return instructors; 
	}
}
