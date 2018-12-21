package com.cms.services;

import java.util.List;

import com.cms.entity.Course;
import com.cms.entity.Instructor;


public interface  CourseService {

	void addCourse(Course course);
	Course editCourse(int id);
	void updateCourse(Course course);
	Course getCourse(int id);
	List<Course> getCourseByYear(String year);
	List<Course> getAllCourses();
	void deleteCourse(int id);
    List<Course> getAllCoursesByTerm(String term);
    List<Course> getAllCoursesByYear(String year);
    List<Course> getAllCoursesByYearANDTermIgnoreCase(String year,String term);
	
    List<Course> getAllCoursesByInstructorId(int id);
}
