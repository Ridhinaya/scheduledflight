package com.springboot.scheduledflight.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="scheduled_flight")
public class Scheduledflight {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private BigInteger scheduledflightid;
	@Column(name="sch_flight")
	private String scheduledflight;
	@Column(name="avai_seats")
	private int availableSeats;
	@Column(name="sch_dule")
	private String schedule;
	public Scheduledflight(BigInteger scheduledflightid, String scheduledflight, int availableSeats, String schedule) {
		super();
		this.scheduledflightid = scheduledflightid;
		this.scheduledflight = scheduledflight;
		this.availableSeats = availableSeats;
		this.schedule = schedule;
	}
	public Scheduledflight() {
		super();
		
	}
	public BigInteger getScheduledflightid() {
		return scheduledflightid;
	}
	public void setScheduledflightid(BigInteger scheduledflightid) {
		this.scheduledflightid = scheduledflightid;
	}
	public String getScheduledflight() {
		return scheduledflight;
	}
	public void setScheduledflight(String scheduledflight) {
		this.scheduledflight = scheduledflight;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

}
