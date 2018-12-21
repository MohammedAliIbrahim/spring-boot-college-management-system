package com.cms.RestControllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cms.entity.Attendance;
import com.cms.entity.Course;
import com.cms.entity.detail;
import com.cms.entity.total;
import com.cms.services.AttendanceService;

@RestController
@RequestMapping("/api")
public class RestAttendanceController {
	@Autowired
	AttendanceService attendnceServcie ;
	
	@GetMapping("/attendance/{coursename}")
	public List<Attendance>  getAllCourseByTermName(@PathVariable("coursename") String coursename) {
		return attendnceServcie.getAllAttendancesByCoursename(coursename);
	}
	


/*@GetMapping(value="/list")
public List<Object[]> getAllCourses(){
	return attendnceServcie.entityser();
}*/
	
	@GetMapping(value="/listexceed/{coursename}")
	public List<String> getattendanceCourses(@PathVariable("coursename") String coursename){
	//public List<detail> getattendanceCourses(@PathVariable("coursename") String coursename){
		//detail d = new detail ();
		//List<String> namelist = new ArrayList<>();
	//	List<detail> detaillist = new ArrayList<>();
	//	namelist = attendnceServcie.getexceedednames(coursename);
		//for (String att: namelist) {
	//d.setSname(att);
	//String name = d.getSname();
	//int n =attendnceServcie.getexceededtimes(coursename, name);	
	//d.setNtimes(n);
	
//	detaillist.add(d);
	
		     // }
	//	return detaillist;
		return attendnceServcie.getexceedednames(coursename);
	}
	
	
	@GetMapping(value="/list/{coursename}")
	//public List<String> getattendanceCourses(@PathVariable("coursename") String coursename){
	public List<detail> getnameandtimebycCourse(@PathVariable("coursename") String coursename){
	//	detail d = new detail ();
		
		
		List<String> namelist = new ArrayList<>();
		
		List<String> ttt = new ArrayList<>();
		List<detail> detaillist = new ArrayList<>();
		namelist = attendnceServcie.getattnames(coursename);
		detail mmm[]= new detail[namelist.size()];
		//for(int i=0;i<namelist.size();i++)
		String s = new String();
		String [] array = new String[namelist.size()];
		array = namelist.toArray(array) ;
			for(int i=0;i<namelist.size();i++) {	
		//int i =	namelist.indexOf(att);
	//String	ssname=namelist.get(i);
	//d.setSname(array[i]);
				
				
				//make number of objects = the no of elements in in namelist
				mmm[i] = new detail();	
				
	String name=	array[i];
	//String name = d.getSname();
	int n =attendnceServcie.getatttimes(coursename, name);	
	
	int percentage    =  ((n * 100) / 15 );
//	d.setNtimes(n);
	s = name + " the abssence times are " +  n ;
	ttt.add(s);
//	detaillist.add(d);
	//assignvalues to objects
	mmm[i].setData(name ,n,percentage);
	detaillist.add(mmm[i]);
	//i++;
	
			}
	      
			return detaillist ;
		//return mmm
		//return ttt ;
		//return attendnceServcie.getexceedednames(coursename);
	}
	
	
	
	
	
	@GetMapping(value="/list/{coursename}/{studentname}")
	public int gettimesCourses(@PathVariable("coursename") String coursename , @PathVariable("studentname") String studentname){
		return attendnceServcie.getexceededtimes(coursename, studentname);
	}
	
	@GetMapping(value="/listtotal/{coursename}")
	public List<String> gettotattendanceCourses(@PathVariable("coursename") String coursename){
		return attendnceServcie.getattnames(coursename);
	}
	
	
	@GetMapping(value="/listtotal/{coursename}/{studentname}")
	public int gettotaltimesCourses(@PathVariable("coursename") String coursename , @PathVariable("studentname") String studentname){
		return attendnceServcie.getatttimes(coursename, studentname);
	}
	
	
	@GetMapping(value="/listpercentagetotal/{coursename}/{studentname}")
	public total getttotaltimesCourses(@PathVariable("coursename") String coursename , @PathVariable("studentname") String studentname){
		
		int ntimes = attendnceServcie.getatttimes(coursename, studentname);
		int percentage    =  ((ntimes * 100) / 15 );
		total total= new total(); 
	total.setNtimes(ntimes);
	total.setPercentage(percentage);
		return total ;
	}
	
	@GetMapping(value = "/get_names_list")
    public List<String> getTagList(@PathVariable("coursename") String  NameSearch) {
        List<String> tagList = attendnceServcie.serachattBySname(NameSearch);
        return tagList;
    }
	
	
}