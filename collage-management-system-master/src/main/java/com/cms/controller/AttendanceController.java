package com.cms.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.cms.entity.attendanceform;
import com.cms.entity.AggregateResults;
import com.cms.entity.Attendance;
import com.cms.entity.Course;
import com.cms.entity.Student;
import com.cms.services.AttendanceService;
import com.cms.services.CourseService;
import com.cms.services.StudentService;
@Controller
public class AttendanceController {
	

	@Autowired
	AttendanceService attendnceServcie ;
	
	@Autowired
	StudentService  studentServcie ; 

	@Autowired
	CourseService courseServcie ; 
	
	//Attendance a = new Attendance();
	//____دى قديمه________________________________________________________________
	
//	@GetMapping("/showattendances")
//	public String showAllCourses(HttpServletRequest request){
//		request.setAttribute("attendance", attendnceServcie.getAllAttendances());
//		request.setAttribute("mode", "ALL_ATTENDANCES");
//		return "welcomecoursepage" ; 
//	}
	
	
	
	
	 
	   @ModelAttribute("secList")
	   public List<String> getWebFrameworkList() {
	      List<String> sec = new ArrayList<String>();
	    sec.add("sec1");
	     sec.add("sec2");
	      sec.add("sec3");
	    sec.add("sec4");
	      return sec;
	   }
/**
	@RequestMapping("/addattendance")
	public String addcourse(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_ADDattendance");
		
		request.setAttribute("students", studentServcie.getAllStudents());
		//request.setAttribute("secList", this.getWebFrameworkList());
		//
		//request.setAttribute("a", a);
		//model.addAttribute("favoriteFrameworks", Attendance.ge));
		return "welcomecoursepage";
	}
	**/
	@PostMapping("/attendance-saved")
	public String saveCourseIndataBase(@ModelAttribute Attendance attendance , BindingResult binding , HttpServletRequest request ,ModelMap model , @RequestParam String coursename , @RequestParam String secorder ){
		
		String sname = attendance.getSname();
		String sectionorder = attendance.getSecorder().trim();
		String course_name = attendance.getCoursename();
		//Attendance att = this.findBySnameEquals(sname);
		List<Attendance> attlist = new ArrayList<>();
	System.out.println("mosaaggggaaaa"+sname+secorder); 
	String	secord = attendance.getSecorder().trim();
	attendance.setSecorder(secord);
		attlist=attendnceServcie.findattendencebysnameandsecorderandcoursename(sname, sectionorder , course_name);
		 for (Attendance att: attlist)
		      System.out.println("mosaaggggaaaa"+att.getStudent()); 
		
		
		if (attlist.isEmpty()) {
			
			
			//attendance.setDone(true);
			attendnceServcie.addAttendance(attendance);	
			
			//model.put("message", " done");
			model.put("message", "<div class=\"alert alert-success alert-dismissible\" >\r\n" + 
					"    <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>\r\n" + 
					"    <strong>done successfully!</strong> .\r\n" + 
					"  </div>");
			
			
			
		}
		
		else
			
		{
			model.put("students", studentServcie.getAllStudents());
			//model.put("message", " the student is already submitted");
		/*	model.put("message", " <div class=\"alert alert-danger fade in\">\r\n" + 
					"                <a href=\"#\" class=\"close\" data-dismiss=\"alert\">&times;</a>\r\n" + 
					"                the student is already submitted" + 
					"</div>");*/
			//model.put ("message", "repeated" );
			
			model.put("message", "<div  id = \"test\" class=\"alert alert-danger fade in\">\r\n" + 
					"                <a href=\"#\" class=\"close\" data-dismiss=\"alert\">&times;</a>\r\n" + 
					"                 the student is already submitted\r\n" + 
					"</div>");
			
		}
		
		
		
	  //    model.put("attendance", new Attendance());
	      
	      
	     model.put("courseno", coursename);
	     
	     model.put("orderofsection", secorder);
		
		//if (user != null && user.getPassword().equals(password)) {
			//return user;
		//}
	    
		//attendnceServcie.addAttendance(attendance);
		//request.setAttribute("mode", "ALL_ATTENDANCES");
		//request.setAttribute("attendance", attendnceServcie.getAllAttendances());
		//request.setAttribute("secList", this.getWebFrameworkList());
	//	request.setAttribute("mode","MODE_HOME");
		//return "redirect:attendance?coursename=coursename&secorder=9" ; 
	     return "attendance";
	}
	
	  /* 
	   @RequestMapping(value = "/attendance", method = RequestMethod.GET)
	   public String addUser(//@ModelAttribute("SpringWeb")Attendance user, 
			      ModelMap model) {
			      //model.addAttribute("username", user.getUsername());
			      model.put("students", studentServcie.getAllStudents());
			      model.put("attendance", new Attendance());
			      List<Attendance> atts=attendnceServcie.getAllAttendances();
			  //    List<Student> studens=studentServcie.getAllStudents();
			    //  for (Student att: studens) {
			    //	  att.getAttendance().
			      //}
			      
				      
			      for (Attendance att: atts) {
			      
			      model.put("atts",att.getDone());
			      }
			    //  model.put("attendanceform", new attendanceform());
			      return "attendance";
			   }
			   */
	
	

	   @RequestMapping(value = "/attendance", method = RequestMethod.GET)
	   public String addUser(//@ModelAttribute("SpringWeb")Attendance user, 
			      ModelMap model , @RequestParam String coursename , @RequestParam String secorder) {
			      //model.addAttribute("username", user.getUsername());
			      model.put("students", studentServcie.getAllStudents());
			      model.put("attendance", new Attendance());
			      
			      
			     model.put("courseno", coursename);
			     
			     model.put("orderofsection", secorder);
			     
			      List<Attendance> atts=attendnceServcie.getAllAttendances();
			  //    List<Student> studens=studentServcie.getAllStudents();
			    //  for (Student att: studens) {
			    //	  att.getAttendance().
			      //}
			    
			      
				      
			     /* for (Attendance att: atts) {
			      
			      model.put("atts",att.getDone());
			      }*/
			    //  model.put("attendanceform", new attendanceform());
			      return "attendance";
			   }
			   
	
	// دى قديمه برده 
	   @RequestMapping(value = "/viewattendance", method = RequestMethod.GET)
	   public String User(//@ModelAttribute("SpringWeb")Attendance user, 
			      ModelMap model) {
			      //model.addAttribute("username", user.getUsername());
			      model.put("attendance", attendnceServcie.getAllAttendances());
			      List<Attendance> atts=attendnceServcie.getAllAttendances();
			      for (Attendance att: atts)
			      System.out.println("mosaaggggaaaa"+att.getStudent()); 
			     // model.put("atte", new Attendance());
			      return "viewattendance";
	   }
			      
				  //foreditingattendance 
				   @RequestMapping(value = "/saveatt", method = RequestMethod.POST)
				   public String User(@ModelAttribute(value="attendance")Attendance attendance, 
						      ModelMap model ,  @RequestParam String coursename , @RequestParam String secorder) {
					   
					   model.put("courseno", coursename);
					     
					     model.put("orderofsection", secorder);
					   /**
					   List<Student> students= new ArrayList<>();
					  
					   studentServcie.getAllStudents().forEach(students::add); 
					  for (Student s : students) {
						   System.out.println("mosaaaaaa"); //  {
						   attendance.setStudentId(s.getId());**/
					     
					     String sectionorder = attendance.getSecorder().trim(); // or from query string params as  String sectionorder = secorder;
					   String	secord = attendance.getSecorder().trim();
						attendance.setSecorder(secord);
					  // for (Attendance s : attendanceform.getAttendaces()) { 
					   attendnceServcie.addAttendance(attendance);
					 //  }
						      //model.addAttribute("username", user.getUsername());
						      //model.put("attendance", attendnceServcie.getAllAttendances());
						     // model.put("atte", new Attendance());
					   model.put("attendance", attendnceServcie.getAllAttendancesByCoursenameAndSecorder(coursename, sectionorder));
						      return "viewcourseattendancedel";

	  /** @RequestMapping(value = "/addUser", method = RequestMethod.POST)
	   public String addUser(@ModelAttribute("SpringWeb")Attendance user, 
	      ModelMap model) {
	      model.addAttribute("username", user.getUsername());
	      model.addAttribute("password", user.getPassword());
	      model.addAttribute("address", user.getAddress());
	      model.addAttribute("receivePaper", user.isReceivePaper());
	      return "users";**/
	   }
				   
				/**   @RequestMapping("/editattendance")
					public String editCourse(@RequestParam int id,HttpServletRequest request) {
						request.setAttribute("course",courseServcie.editCourse(id));
						request.setAttribute("mode", "MODE_UPDATE");
						return "welcomecoursepage";
				}**/
				   
				   // دى قديمه 
				   @RequestMapping("/course attendance")
					public String deleteCourse(@RequestParam int id, HttpServletRequest request) {
						courseServcie.deleteCourse(id);
						request.setAttribute("courses", courseServcie.getAllCourses());
						request.setAttribute("mode", "ALL_COURSES");
						return "welcomecoursepage";
					} 
				   

				   // دي بتاعت اضافه الغياب 
					@GetMapping("/courseattendance")
					public String showAllCourse(HttpServletRequest request){
						request.setAttribute("courses", courseServcie.getAllCourses());
						request.setAttribute("mode", "ALL_COURSES");
						return "courseattendance" ; 
					}
					
// دى بتاعت اظهار الغياب الى انا خدته 
					@GetMapping("/viewcourseattendance")
					public String showAllCourse2(HttpServletRequest request){
						request.setAttribute("courses", courseServcie.getAllCourses());
						request.setAttribute("mode", "ALL_COURSES");
						return "viewcourseattendance" ; 
					}
				   
					// شغاله 
					@RequestMapping(value = "/viewcourseattendance2", method = RequestMethod.GET)
					   public String attendacebycourse(//@ModelAttribute("SpringWeb")Attendance user, 
							      ModelMap model ,  @RequestParam String coursename ,  @RequestParam String secorder) {
							      //model.addAttribute("username", user.getUsername());
							     // model.put("attendance", attendnceServcie.getAllAttendancesByCoursename(coursename));
							      model.put("attendance", attendnceServcie.getAllAttendancesByCoursenameAndSecorder(coursename, secorder));
							      List<Attendance> atts=attendnceServcie.getAllAttendancesByCoursenameAndSecorder(coursename, secorder);
							      for (Attendance att: atts)
							      System.out.println("mosaaggggaaaa"+att.getStudent()); 
							     // model.put("atte", new Attendance());
							      
							      model.put("courseno", coursename);
							     model.put("orderofsection", secorder);
							      return "viewcourseattendance2";
					   }
					
					
					@RequestMapping(value = "/viewex", method = RequestMethod.GET)
					   public String attendace(//@ModelAttribute("SpringWeb")Attendance user, 
							      ModelMap model ,  @RequestParam String coursename) {
							     
							      model.put("attendance", attendnceServcie.getexeededattendancecoursename(coursename));
							     // model.put("attendance", attendnceServcie.getAllByCoursenameAndSecorder(coursename, secorder));
							      List<AggregateResults> atts=attendnceServcie.getexeededattendancecoursename(coursename);
							      for (AggregateResults att: atts)
							      System.out.println("mosaaggggaaaa"+att.getNotimes()); 
							     // model.put("atte", new Attendance());
							      
							      model.put("courseno", coursename);
							   //   model.put("orderofsection", secorder);
							      return "ex";
					   }
					
					
					//@GetMapping(value="/exceednamesattendance/{coursename}")
					@RequestMapping(value = "/exceednamesattendance", method = RequestMethod.GET)
					
					 public String	showattendanceCourses(@RequestParam String coursename , ModelMap model)
					    {
							     
							      model.put("attendance", attendnceServcie.getexceedednames(coursename));
							     // model.put("attendance", attendnceServcie.getAllByCoursenameAndSecorder(coursename, secorder));
							  
							      model.put("courseno", coursename);
							   //   model.put("orderofsection", secorder);
							      return "exceedednames";
					   }
					
					   
					
					@RequestMapping(value = "/attendancedetails", method = RequestMethod.GET)
					   public String attendacedetails(//@ModelAttribute("SpringWeb")Attendance user, 
							      ModelMap model ,  @RequestParam String coursename , @RequestParam String studentname) {
							     
							      model.put("attendance", attendnceServcie.getexceededtimes(coursename, studentname));
							     // model.put("attendance", attendnceServcie.getAllByCoursenameAndSecorder(coursename, secorder));
							     
							     // model.put("atte", new Attendance());
							     int ntimes =  attendnceServcie.getexceededtimes(coursename, studentname);
							      model.put("courseno", coursename);
							float percentage    = (float) ((ntimes * 100) / 15 );
							      model.put("percentage", percentage);
							      
							      model.put("sname", studentname);
							   //   model.put("orderofsection", secorder);
							      return "exceededtimes";
					   }

					
					//شغاله 
					@GetMapping("/exceedcourseattendance")
					public String showexceededCourse(HttpServletRequest request){
						request.setAttribute("courses", courseServcie.getAllCourses());
						request.setAttribute("mode", "ALL_COURSES");
						return "exceededcourses" ; 
					}	
					
					
					//شغاله 
					@GetMapping("/totalcourseattendance")
					public String showtotalattenCourse(HttpServletRequest request){
						request.setAttribute("courses", courseServcie.getAllCourses());
						request.setAttribute("mode", "ALL_COURSES");
						return "totalattcourses" ; 
				
				}	
			
					// شغاله
					@RequestMapping(value = "/totalnamesattendance", method = RequestMethod.GET)
					
					 public String	showtotalattendanceCourses(@RequestParam String coursename , ModelMap model)
					    {
							     
							      model.put("attendance", attendnceServcie.getattnames(coursename));
							     // model.put("attendance", attendnceServcie.getAllByCoursenameAndSecorder(coursename, secorder));
							  
							      model.put("courseno", coursename);
							   //   model.put("orderofsection", secorder);
							      return "totalattnames";
					   }
					
					// شغاله
					// used to search by get method
					@RequestMapping(value = "/totalnamesattendances", method = RequestMethod.GET)
					
					 public String	ShowtotalattendanceCourses(@RequestParam String coursename , ModelMap model ,@RequestParam String NameSearch)
					    {
						
 //try static data   String course = " m" ;
//String courses = "data structure" ;
						
			            if (NameSearch != null && NameSearch != " ")

			            {
			                
			                model.put("attendance", attendnceServcie.searchattendencebysnameandcoursename(  NameSearch, coursename));


			}
			            
			            else {
			            model.put("attendance", attendnceServcie.getattnames(coursename));
							     // model.put("attendance", attendnceServcie.getAllByCoursenameAndSecorder(coursename, secorder));
			            }
							      model.put("courseno", coursename);
							   //   model.put("orderofsection", secorder);
							      return "totalattnames";
					   }
					
					
					 @RequestMapping(value = "/get_names_list",  method = RequestMethod.GET)
					    public @ResponseBody List<String> getTagList(@RequestParam(" NameSearch") String  NameSearch) {
					        List<String> tagList = attendnceServcie.serachattBySname(NameSearch);
					        return tagList;
					    }
					
				// شغاله 	
					@RequestMapping(value = "/totalattendancedetails", method = RequestMethod.GET)
					   public String totalattendacedetails(//@ModelAttribute("SpringWeb")Attendance user, 
							      ModelMap model ,  @RequestParam String coursename , @RequestParam String studentname) {
							     
							      model.put("attendance", attendnceServcie.getatttimes(coursename, studentname));
							     // model.put("attendance", attendnceServcie.getAllByCoursenameAndSecorder(coursename, secorder));
							     
							     // model.put("atte", new Attendance());
							     int ntimes =  attendnceServcie.getatttimes(coursename, studentname);
							      model.put("courseno", coursename);
							float percentage    = (float) ((ntimes * 100) / 15 );
							      model.put("percentage", percentage);
							      
							      model.put("sname", studentname);
							   //   model.put("orderofsection", secorder);
							      return "totalatttimes";
					   }
					
					
					
					
					@RequestMapping("/deleteattendance")
					public String deleteatten(@RequestParam int id,  ModelMap model ,  @RequestParam String coursename , @RequestParam String secorder ) {
						attendnceServcie.deleteattendance(id);
						 model.put("attendance", attendnceServcie.getAllAttendancesByCoursenameAndSecorder(coursename, secorder));
						return "viewcourseattendancedel";
					}
					
					
					@RequestMapping(value = "/viewcourseattendancedel", method = RequestMethod.GET)
					   public String delattendacebycourse(//@ModelAttribute("SpringWeb")Attendance user, 
							      ModelMap model ,  @RequestParam String coursename ,  @RequestParam String secorder) {
							    
							      model.put("attendance", attendnceServcie.getAllAttendancesByCoursenameAndSecorder(coursename, secorder));
							     
							      
							      model.put("courseno", coursename);
							     model.put("orderofsection", secorder);
							      return "viewcourseattendancedel";
					   }
					
					
					// شغاله 
					@GetMapping("/deletecourseattendance")
					public String deleteattCourse(HttpServletRequest request){
						request.setAttribute("courses", courseServcie.getAllCourses());
						request.setAttribute("mode", "ALL_COURSES");
						return "delattcourses" ; 	
					
					}
						@RequestMapping("/editattendance")
						public String editatt(@RequestParam int id,HttpServletRequest request , ModelMap model ,   @RequestParam String coursename , @RequestParam String secorder ) {
							request.setAttribute("attendance", attendnceServcie.editattendance(id));
							request.setAttribute("mode", "MODE_UPDATE");
							
							// model.put("students", studentServcie.getAllStudents());
						   //   model.put("attendance", new Attendance());
						      
						      
						   model.put("courseno", coursename);
						     
						     model.put("orderofsection", secorder);
						     
							
							return "editattendance";
					}
					
}
	   
