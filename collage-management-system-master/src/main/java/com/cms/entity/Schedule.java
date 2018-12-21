package com.cms.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="schedule")
@NamedQuery(name="Schedule.findAll", query="SELECT s FROM Schedule s")
public class Schedule implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="SCHEDULE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SCHEDULE_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	private int id ;
	
	@Column(name = "year")
	private String year ; 	
	
	@Column(name = "sat")
	private String sat;
	
	@Column( name = "sun")
	private String sun;
	
	@Column( name = "mon")
	private String mon;
	
	@Column( name = "tues")
	private String tues;
	
	@Column( name = "wed")
	private String wed;
	
	@Column( name = "thr")
	private String thr ; 
	@Column( name = "fri")
	private String fri;
	
	
	public String getSat() {
		return sat;
	}
	public void setSat(String sat) {
		this.sat = sat;
	}
	public String getSun() {
		return sun;
	}
	public void setSun(String sun) {
		this.sun = sun;
	}
	public String getMon() {
		return mon;
	}
	public void setMon(String mon) {
		this.mon = mon;
	}
	public String getTues() {
		return tues;
	}
	public void setTues(String tues) {
		this.tues = tues;
	}
	public String getWed() {
		return wed;
	}
	public void setWed(String wed) {
		this.wed = wed;
	}
	public String getThr() {
		return thr;
	}
	public void setThr(String thr) {
		this.thr = thr;
	}
	public String getFri() {
		return fri;
	}
	public void setFri(String fri) {
		this.fri = fri;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
}
