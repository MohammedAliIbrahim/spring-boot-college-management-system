package com.cms.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cms.entity.Student;
import com.cms.services.StudentService;

@RestController
@RequestMapping("/students")
public class RestStudentController {

	
	@Autowired
	StudentService studentService;

	
	@RequestMapping("/list/{id}")
	public Student getstudentProfile(@PathVariable int id) {
		// TODO Auto-generated method stub
		return studentService.getStudent(id);
	}

	
	@GetMapping("/list")
	public  List<Student> getList(){		
		List<Student>  students = studentService.getAllStudents(); 
		System.out.println("s= "+students.size());
		return students; 
	}
	
}
