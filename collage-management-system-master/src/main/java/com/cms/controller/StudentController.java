package com.cms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cms.services.StudentService;


@Controller
public class StudentController {

	
	@Autowired
	StudentService  studentServcie ; 
	
	@GetMapping("/showstudents")
	public String showAllCourses(HttpServletRequest request){
		request.setAttribute("students", studentServcie.getAllStudents());
		request.setAttribute("mode", "ALL_STUDENTS");
		System.out.println("mostafaaaaaaaaa");
		return "allstudentspage" ; 
	}
	
	
	
	@GetMapping("/showstudents/{id}")
	public String  getStudentProfile(@PathVariable("id") int id , HttpServletRequest request)
	{
		request.setAttribute("mode","MODE_STUDENT_PROFILE");
		request.setAttribute("student", studentServcie.getStudent(id));
		return "studentprofilepage" ;
	}
}































