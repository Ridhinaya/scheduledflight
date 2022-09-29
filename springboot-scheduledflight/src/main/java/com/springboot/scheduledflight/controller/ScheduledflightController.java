package com.springboot.scheduledflight.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.scheduledflight.model.Scheduledflight;
import com.springboot.scheduledflight.service.ScheduledflightService;

@RestController
@RequestMapping("/api/sch")
public class ScheduledflightController {
	
	private ScheduledflightService scheduleService;

	public ScheduledflightController(ScheduledflightService scheduleService) {
		super();
		this.scheduleService = scheduleService;
	}
	
	@PostMapping
	public ResponseEntity<Scheduledflight> saveScheduledflight(@RequestBody Scheduledflight scheduledflight){
		return new ResponseEntity<Scheduledflight>(scheduleService.saveScheduledflight(scheduledflight),
				HttpStatus.CREATED);
	}
	@GetMapping
	public List<Scheduledflight> getAllScheduledflights(){
		return scheduleService.getAllScheduledflights();
	}
	@GetMapping("{id}")
	public ResponseEntity<Scheduledflight>findById(@PathVariable("id") BigInteger id){
		return new ResponseEntity<Scheduledflight>(scheduleService.getScheduledflightById(id),
				HttpStatus.OK);
	}
	@PutMapping("{id}")
	public ResponseEntity<Scheduledflight>updateScheduledflight(@PathVariable("id") BigInteger id,
			@RequestBody Scheduledflight scheduledflight){
		return new ResponseEntity<Scheduledflight>(scheduleService.updateScheduleflight(scheduledflight,id),
				HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String>deleteScheduledflight(@PathVariable("id")BigInteger id){
		scheduleService.deleteScheduledflight(id);
		return new ResponseEntity<String>("Scheduledflight details deleted successfully...!",HttpStatus.OK);
	}

}
