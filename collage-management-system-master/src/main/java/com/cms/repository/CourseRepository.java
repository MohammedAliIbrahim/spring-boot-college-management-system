package com.cms.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cms.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Integer>  {
	
	List<Course> findAllByTermIgnoreCase(String term); 
	List<Course> findAllByYearIgnoreCase(String year);
//	List<Course> findAllByInstructorIgnoreCase(int id);
	
	@Query(value ="SELECT * FROM  course WHERE  instructor_id = ?1" , nativeQuery = true)
	List<Course> findbyinstrucor(int id);
 	
	List<Course> findAllByYearAndTermIgnoreCase(String year , String term);
	Course findById(int id);
	 
	

}
