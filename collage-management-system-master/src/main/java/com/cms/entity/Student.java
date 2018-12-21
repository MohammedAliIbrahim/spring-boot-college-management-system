package com.cms.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Set;


/**
 * The persistent class for the student database table.
 * 
 */
@Entity
@Table(name="student")
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="STUDENT_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STUDENT_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	private int id;

	
	@Column(length=255)
	private String gpa;

	@Column(name="level" ,  length=255)
	private String level;
//	@Column(name="student_key")
//	private int studentKey;

	//bi-directional many-to-one association to Notification
	@OneToMany(mappedBy="student")
	private Set<Notification> notifications;

//	//bi-directional one-to-one association to Attendance
//	@OneToOne
//	@JoinColumn(name="id", nullable=false, insertable=false, updatable=false)
//	private Attendance attendance;

	//bi-directional many-to-one association to User
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="id", nullable=false, insertable=false, updatable=false)
	private Attendance attendance;


	
	public Attendance getAttendance() {
		return attendance;
	}

	public void setAttendance(Attendance attendance) {
		this.attendance = attendance;
	}

	@Column(length=255)
	private String department;
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Column(name="name")
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	//bi-directional many-to-many association to Course
	@ManyToMany
	@JoinTable(
		name="student_course"
		, joinColumns={
			@JoinColumn(name="student_id", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="course_id", nullable=false)
			}
		)
	private Set<Course> courses;

	//bi-directional many-to-one association to StudentExam
	@OneToMany(mappedBy="student")
	private Set<StudentExam> studentExams;

	public Student() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getGpa() {
		return this.gpa;
	}

	public void setGpa(String gpa) {
		this.gpa = gpa;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

//	public int getStudentKey() {
//		return this.studentKey;
//	}
//
//	public void setStudentKey(int studentKey) {
//		this.studentKey = studentKey;
//	}

	public Set<Notification> getNotifications() {
		return this.notifications;
	}

	public void setNotifications(Set<Notification> notifications) {
		this.notifications = notifications;
	}

	public Notification addNotification(Notification notification) {
		getNotifications().add(notification);
		notification.setStudent(this);

		return notification;
	}

	public Notification removeNotification(Notification notification) {
		getNotifications().remove(notification);
		notification.setStudent(null);

		return notification;
	}

//	public Attendance getAttendance() {
//		return this.attendance;
//	}
//
//	public void setAttendance(Attendance attendance) {
//		this.attendance = attendance;
//	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Course> getCourses() {
		return this.courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public Set<StudentExam> getStudentExams() {
		return this.studentExams;
	}

	public void setStudentExams(Set<StudentExam> studentExams) {
		this.studentExams = studentExams;
	}

	public StudentExam addStudentExam(StudentExam studentExam) {
		getStudentExams().add(studentExam);
		studentExam.setStudent(this);

		return studentExam;
	}

	public StudentExam removeStudentExam(StudentExam studentExam) {
		getStudentExams().remove(studentExam);
		studentExam.setStudent(null);

		return studentExam;
	}

}