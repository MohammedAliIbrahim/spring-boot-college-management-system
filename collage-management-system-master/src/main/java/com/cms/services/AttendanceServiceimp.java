package com.cms.services;

import java.util.ArrayList;
import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.entity.AggregateResults;
import com.cms.entity.Attendance;
//import com.cms.entity.Course;
import com.cms.repository.AttendanceRepository;
//import com.cms.repository.CourseRepository;
@Service
public class AttendanceServiceimp implements AttendanceService {
	
	@Autowired
	AttendanceRepository attendanceRepository;
	@Override
	public List<Attendance> getAllAttendances() {
		
			List<Attendance> attendances = new ArrayList<>();
			attendanceRepository.findAll().forEach(attendances::add);
			return attendances;
		}
	@Override
	public void addAttendance(Attendance attendance) {
		
			attendanceRepository.save(attendance);
			
		
		
	}
	public void addAllAttendance(List<Attendance> attendances) {
		
		attendanceRepository.saveAll(attendances);
		
	
	
}
	@Override
	public List<Attendance> getAllAttendancesByCoursename(String coursename) {
		return attendanceRepository.findAllByCoursenameIgnoreCase(coursename);
	}
	
	//@Override
	//public List<AggregateResults> getexeededattendancecoursename(String coursename) {
		// TODO Auto-generated method stub
		//return attendanceRepository.getexeededattendancecoursename(coursename);
	//}
	@Override
	public List<Object[]> entityser() {

		
		
		 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(" attendance");
		    
		    EntityManager entitymanager = emfactory.createEntityManager( );
		
		    entitymanager.getTransaction().begin();
		    
		    
		   javax.persistence.Query q = entitymanager.createNativeQuery("SELECT * FROM attendance ");
		    List<Object[]> authors = q.getResultList();
		    List<Object[]> aus = new ArrayList<>();
		 for (Object[] a : authors) {
			  
			  
		  
		    System.out.println("Author "
		             + a[0]
		          + " "
		               + a[1]);
		    
		 }
		       // authors.forEach(aus::add);
		  // return aus;
		  return authors;
		//  }
	}
	@Override
	public List<AggregateResults> getexeededattendancecoursename(String coursename) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<String> getexceedednames(String name) {
		// TODO Auto-generated method stub
		return attendanceRepository.getexceedednames(name);
	}
	@Override
	public int getexceededtimes(String name, String sname) {
		// TODO Auto-generated method stub
		return attendanceRepository.getexceededtimes(name, sname);
	}
	@Override
	public List<String> getattnames(String name) {
		// TODO Auto-generated method stub
		return attendanceRepository.getattnames(name);
	}
	@Override
	public int getatttimes(String name, String sname) {
		// TODO Auto-generated method stub
		return attendanceRepository.getatttimes(name, sname) ;
	}
	@Override
	public List<Attendance> getAllAttendancesByCoursenameAndSecorder(String coursename, String secorder) {
		// TODO Auto-generated method stub
		return attendanceRepository.findAllByCoursenameAndSecorderIgnoreCase(coursename, secorder);
	}
	@Override
	public void deleteattendance(int id) {
		// TODO Auto-generated method stub
		attendanceRepository.deleteById(id);
	}
	@Override
	public List<Attendance> findattendencebysnameandsecorderandcoursename(String sname, String secorder , String coursename) {
		// TODO Auto-generated method stub
		return attendanceRepository.findattBySnameAndSecorder(sname, secorder , coursename) ;
	}
	@Override
	public Attendance editattendance(int id) {
		// TODO Auto-generated method stub
		return attendanceRepository.findById(id);
	}
	@Override
	public List<String> searchattendencebysnameandcoursename(String sname, String coursename) {
		// TODO Auto-generated method stub
		return attendanceRepository.serachattBySnameAndcoursename(sname, coursename);
	}
	@Override
	public List<String> serachattBySname(String sname) {
		// TODO Auto-generated method stub
		return attendanceRepository.serachattBySname(sname);
	}
	
	}
		
	


