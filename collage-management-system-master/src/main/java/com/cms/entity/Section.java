package com.cms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the section database table.
 * 
 */
@Entity
@Table(name="section")
@NamedQuery(name="Section.findAll", query="SELECT s FROM Section s")
public class Section implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SECTION_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SECTION_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="course_id")
	private int courseId;

//	@Column(name="instructor_id", unique=true)
//	private int instructorId;

	@Column(length=255)
	private String name;

	@Column(length=255)
	private String room;

	@Column(name="schedule_id", unique=true)
	private int scheduleId;

	//bi-directional many-to-many association to Course
	@ManyToMany(mappedBy="sections")
	private Set<Course> courses;

//	//bi-directional one-to-one association to Instructor
//	@OneToOne(mappedBy="section")
//	private Instructor instructor;

	//bi-directional one-to-one association to Attendance
	@OneToOne
	@JoinColumn(name="id", nullable=false, insertable=false, updatable=false)
	private Attendance attendance;

	public Section() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCourseId() {
		return this.courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

//	public int getInstructorId() {
//		return this.instructorId;
//	}
//
//	public void setInstructorId(int instructorId) {
//		this.instructorId = instructorId;
//	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoom() {
		return this.room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public int getScheduleId() {
		return this.scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Set<Course> getCourses() {
		return this.courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

//	public Instructor getInstructor() {
//		return this.instructor;
//	}
//
//	public void setInstructor(Instructor instructor) {
//		this.instructor = instructor;
//	}

	public Attendance getAttendance() {
		return this.attendance;
	}

	public void setAttendance(Attendance attendance) {
		this.attendance = attendance;
	}

}