package com.cms.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * The persistent class for the instructor database table.
 * 
 */

@JsonIgnoreProperties(ignoreUnknown=true)
@Entity
@Table(name="instructor")
@NamedQuery(name="Instructor.findAll", query="SELECT i FROM Instructor i")
public class Instructor implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	@SequenceGenerator(name="INSTRUCTOR_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="INSTRUCTOR_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	private int id;

	
//	@Column(name="department_id", unique=true)
//	private int departmentId;

	
	@OneToMany(mappedBy="instructor" , fetch=FetchType.EAGER)
	private List<Course> courses;
	
	@Column(length=255)
	private String rank;

	
	@Column(name="courses_taught" , length=255)
	private String coursesTaught;
	
	public String getCoursesTaught() {
		return coursesTaught;
	}

	public void setCoursesTaught(String coursesTaught) {
		this.coursesTaught = coursesTaught;
	}

	public String getResarchInterests() {
		return resarchInterests;
	}

	public void setResarchInterests(String resarchInterests) {
		this.resarchInterests = resarchInterests;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getTimeAtTanta() {
		return timeAtTanta;
	}

	public void setTimeAtTanta(String timeAtTanta) {
		this.timeAtTanta = timeAtTanta;
	}

	public String getCurrentActivities() {
		return currentActivities;
	}

	public void setCurrentActivities(String currentActivities) {
		this.currentActivities = currentActivities;
	}
	
	
	
	@Transient
	private MultipartFile file ; 

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	@Column(name="resarch_interests" , length=255)
	private String resarchInterests;
	
    @Column(name="education" , length=255)
	private String education;
	
    @Column(name="time_at_tanta" , length=255)
	private String timeAtTanta;
    
    @Column(name="current_activities" , length=255)
	private String currentActivities;
	
    @Column(name="current_research" , length=255)
	private String currentResearch;
    
	public String getCurrentResearch() {
		return currentResearch;
	}

	public void setCurrentResearch(String currentResearch) {
		this.currentResearch = currentResearch;
	}

//	@Column(name="instructor_Img", length=255)
//	private String instructorImg;

	@Column(name="other_titles", length = 255)
	private String otherTitles ; 
	
	
	//bi-directional one-to-one association to Department
//	@OneToOne(mappedBy="instructor")
//	private Department department;

	//bi-directional one-to-one association to Section
//	@OneToOne
//	@JoinColumn(name="id", nullable=false, insertable=false, updatable=false)
//	private Section section;

	//bi-directional many-to-one association to User
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public Instructor() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public int getDepartmentId() {
//		return this.departmentId;
//	}
//
//	public void setDepartmentId(int departmentId) {
//		this.departmentId = departmentId;
//	}

	public String getRank() {
		return this.rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Column(name="code" , length=255)
	private String Code ; 
//	public String getInstructorImg() {
//		return this.instructorImg;
//	}
//
//	public void setInstructorImg(String instructorImg) {
//		this.instructorImg = instructorImg;
//	}
	
	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getOtherTitles() {
		return otherTitles;
	}

	public void setOtherTitles(String otherTitles) {
		this.otherTitles = otherTitles;
	}
	
	


//	public Department getDepartment() {
//		return this.department;
//	}
//
//	public void setDepartment(Department department) {
//		this.department = department;
//	}
//
//	public Section getSection() {
//		return this.section;
//	}
//
//	public void setSection(Section section) {
//		this.section = section;
//	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}