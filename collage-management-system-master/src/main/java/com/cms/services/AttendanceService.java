package com.cms.services;

import java.util.List;

import com.cms.entity.AggregateResults;
import com.cms.entity.Attendance;
//import com.cms.entity.Course;

public interface AttendanceService {
	List<Attendance> getAllAttendances();
	void addAttendance(Attendance attendance);
	 List<Attendance> getAllAttendancesByCoursename(String coursename);
	 
	 List<Attendance> getAllAttendancesByCoursenameAndSecorder(String coursename , String secorder); 
	 List<  AggregateResults > getexeededattendancecoursename(String coursename);
	  List<  Object[] > entityser();
	  
	  void deleteattendance(int id);
	  Attendance editattendance(int id);
	  List<String> getexceedednames(String name);
	  int getexceededtimes(String name , String sname);
	  
	  List<String> getattnames(String name);
	  int getatttimes(String name , String sname);
	  List<Attendance> findattendencebysnameandsecorderandcoursename(String sname , String secorder , String coursename);
	  List<String> searchattendencebysnameandcoursename(String sname , String coursename);
	  List<String> serachattBySname(String sname );
}
