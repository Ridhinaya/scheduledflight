package com.springboot.scheduledflight.imp;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.scheduledflight.exception.ResourceNotFoundException;
import com.springboot.scheduledflight.model.Scheduledflight;
import com.springboot.scheduledflight.repository.ScheduledflightRep;
import com.springboot.scheduledflight.service.ScheduledflightService;
@Service
public class ScheduledflightServiceImp implements ScheduledflightService {
	@Autowired
	private ScheduledflightRep scheduleRep;

	public ScheduledflightServiceImp(ScheduledflightRep scheduleRep) {
		super();
		this.scheduleRep = scheduleRep;
	}

	@Override
	public Scheduledflight saveScheduledflight(Scheduledflight scheduledflight) {
		return scheduleRep.save(scheduledflight);
	}

	@Override
	public List<Scheduledflight> getAllScheduledflights() {
		return scheduleRep.findAll();
	}

	@Override
	public Scheduledflight getScheduledflightById(BigInteger id) {
		return scheduleRep.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Scheduledflight","Id",id));
	}

	@Override
	public Scheduledflight updateScheduleflight(Scheduledflight scheduledflight, BigInteger id) {
		Scheduledflight big=scheduleRep.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Scheduledflight","Id",id));
		
		big.setScheduledflight(big.getScheduledflight());
		big.setScheduledflightid(big.getScheduledflightid());
		big.setAvailableSeats(big.getAvailableSeats());
		big.setSchedule(big.getSchedule());
		return big;
		
		
	}

	@Override
	public void deleteScheduledflight(BigInteger id) {
	   scheduleRep.findById(id).orElseThrow(()->
	   new ResourceNotFoundException("Scheduledflight","Id",id));
	   scheduleRep.deleteById(id);
		
	}
	

}
