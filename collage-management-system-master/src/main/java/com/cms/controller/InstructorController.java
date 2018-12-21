package com.cms.controller;



import java.util.List;
//import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import com.cms.entity.Course;
import com.cms.entity.Instructor;
import com.cms.services.CourseService;
import com.cms.services.InstructorService;
import com.cms.util.FileUploadUtility;



@Controller
public class InstructorController {

	@Autowired CourseService courseService;
	
	
	@Autowired InstructorService instructorService;
	
	@GetMapping("/AllInstructors")
	public String showAllInstructors(HttpServletRequest request){
		request.setAttribute("instructors", instructorService.getListOfInstructors());
		request.setAttribute("mode", "ALL_INSTRUCTORS");
		List<Instructor> list = instructorService.getListOfInstructors() ; 
		
		System.out.println("instructors "+ list.size());
		return "instructorspage" ; 
	}
	
	//@SuppressWarnings("unchecked")
	@GetMapping("/AllInstructors/{id}")
	public String  getInstructorProfile(@PathVariable("id") int id , HttpServletRequest request)
	{
//		
		Instructor in = instructorService.getInstructorProfile(id);
//		
		in.setCourses(courseService.getAllCoursesByInstructorId(id));
//		
		
		request.setAttribute("mode","MODE_INSTRUCTOR_PROFILE");
		request.setAttribute("instructorProfile", instructorService.getInstructorProfile(id));
		System.out.println(in.getCourses().size());
		return "instructorprofilepage" ;
	}
	
	@RequestMapping("/addinstructorProfiledata")
	public String addInstructorProfileData(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_ADD_INSTRUCTOR_PROFILE_DATA");
		return "addinstructorprofiledatapage";
	}
	
	@PostMapping("/instructor-profile-saved")
	public String saveInstructorProfile(@ModelAttribute Instructor instructor , BindingResult binding , HttpServletRequest request ){
		System.out.println("save instrcutor profile");
		instructorService.createInstructor(instructor);
		
		 //upload the file
		 if(!instructor.getFile().getOriginalFilename().equals("") ){
			 
			 System.out.println("here");
			 
			FileUploadUtility.uploadFile(request, instructor.getFile() , instructor.getCode()); 
		 }
		
		System.out.println("saved !");
		request.setAttribute("mode", "MODE_HOME");
		return "welcomepage" ; 
	}
	
	@RequestMapping("/edit-instructor-profile")
	public String editInstructorProfile(@RequestParam int id,HttpServletRequest request) {
		request.setAttribute("instructorProfile",instructorService.editInstructor(id));
		request.setAttribute("mode", "MODE_UPDATE_PRO");
		return "instructorprofilepage";
	}
	
	
}
