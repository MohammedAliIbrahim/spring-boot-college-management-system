package com.cms.RestControllers;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cms.entity.Course;
import com.cms.services.CourseService;

@RestController
@RequestMapping("/courses")
public class RestCourseController {
	@Autowired
	CourseService courseService;
	
	@PostMapping("/add")
	public void addcourse(@RequestBody Course course) {
		
		courseService.addCourse(course);
	}
	
	@GetMapping(value="/list")
	public List<Course> getAllCourses(){
		return courseService.getAllCourses();
	}
	
	@PutMapping(value="/update")
	public void updateCourse(@RequestBody Course course) {
		courseService.updateCourse(course);
	}
	
	@GetMapping("/{id}")
	public Course  getCourse(@PathVariable("id") int id) {
		return courseService.getCourse(id);
	}
	
	@GetMapping("/byterm/{term}")
	public List<Course>  getAllCourseByTermName(@PathVariable("term") String term) {
		return courseService.getAllCoursesByTerm(term);
	}
	
	@GetMapping("/byyear/{year}")
	public List<Course>  getAllCourseByYearName(@PathVariable("year") String year) {
		return courseService.getAllCoursesByYear(year);
	}
	
	
	@GetMapping("/byyearandterm")
	public List<Course>  getAllCourseByYearANDTerm(@RequestParam String year, @RequestParam String term)  {
		System.out.println(year + " and " + term);
		return courseService.getAllCoursesByYearANDTermIgnoreCase(year, term);
	}
	
	
	@DeleteMapping("/course/release/{id}")
	public void releaseCourse(@PathVariable int id) {
		courseService.deleteCourse(id);
	}
	
//	@GetMapping("/save-course")
//	public String saveCourse(@RequestParam String name , @RequestParam String  description , @RequestParam String term , @RequestParam String type , 
//			@RequestParam String imageUrl, @RequestParam String instructor   , @RequestParam String year  ){
//		Course course = new Course(name , description ,term , type, imageUrl , instructor ,year); 
//		courseService.addCourse(course);
//		return "user saved" ; 
//	}
	
}





















