package com.cms.services;



import java.util.ArrayList;
import java.util.List;


import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import com.cms.entity.Schedule;
import com.cms.repository.ScheduleRepository;

@Service
@Transactional
public class ScheduleServiceImpl  implements ScheduleService{

	
	private final ScheduleRepository scheduleRepository;

	
	public ScheduleServiceImpl(ScheduleRepository scheduleRepository){
		this.scheduleRepository = scheduleRepository ; 
	}
	
	@Override
	public void addSchedule(Schedule schedule) {
		scheduleRepository.save(schedule);
		
	}

	@Override
	public List<Schedule> getSchedule() {
		List<Schedule> schedules= new ArrayList<>();
		scheduleRepository.findAll().forEach(schedules::add);
		return schedules;
	}

}
