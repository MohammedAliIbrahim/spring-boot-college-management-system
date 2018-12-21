package com.cms.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cms.entity.Schedule;
import com.cms.services.ScheduleService;

@RestController
@RequestMapping("/schedule")
public class RestScheduleController {

	
	@Autowired
	private ScheduleService  scheduleService ;
	
	
	@GetMapping(value="/list")
	public List<Schedule> getAllCourses(){
		return scheduleService.getSchedule();
	}
}
