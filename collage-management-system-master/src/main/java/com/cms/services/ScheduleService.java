package com.cms.services;


import java.util.List;


import com.cms.entity.Schedule;

public interface ScheduleService {

	
	void addSchedule(Schedule schedule);
	
	List<Schedule> getSchedule() ; 
}
