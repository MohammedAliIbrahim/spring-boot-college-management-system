package com.cms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the attendance database table.
 * 
 */
@Entity
@Table(name="attendance")
@NamedQuery(name="Attendance.findAll", query="SELECT a FROM Attendance a")
public class Attendance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ATTENDANCE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ATTENDANCE_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_attended")
	private Date dateAttended;
	@Column(name="pre")
	private Boolean pre;
	@Column(name="secorder")
	private String secorder ;
	//@Column(name="secserial")
	//private int secserial ;
	/*@Column(name="done")
	private Boolean done;
	public Boolean getDone() {
		return done;
	}

	public void setDone(Boolean done) {
		this.done = done;
	}*/

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getSecorder() {
		return secorder;
	}

	public void setSecorder(String secorder) {
		this.secorder = secorder;
	}

	public Boolean getPre() {
		return pre;
	}

	public void setPre(Boolean pre) {
		this.pre = pre;
	}


	@Column(length=255)
	private String hours;

	@Column(name="remark_text", length=255)
	private String remarkText;

	//@Column(name="section_id", unique=true)

//private int sectionId;
	
	//@Column(name="course-id")
//private int coursid;
/*	public int getCoursid() {
		return coursid;
	}

	public void setCoursid(int coursid) {
		this.coursid = coursid;
	}*/


	@Column(name="student_id", unique=true)
	private int studentId;

	//bi-directional many-to-one association to Course
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course course;

	//bi-directional one-to-one association to Section
	//@OneToOne(mappedBy="attendance")
	//private Section section;

	//bi-directional one-to-one association to Student
	
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}


	@OneToOne(mappedBy="attendance")
	private Student student;

	public Attendance() {
	}
	@Column(name="sname")
	private String sname;
	@Column(name="course_name")
	private String coursename;
	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	/**
	@Column(name="course_id")
	private int courseid;
	
	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
*/
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateAttended() {
		return this.dateAttended;
	}

	public void setDateAttended(Date dateAttended) {
		this.dateAttended = dateAttended;
	}

	public String getHours() {
		return this.hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getRemarkText() {
		return this.remarkText;
	}

	public void setRemarkText(String remarkText) {
		this.remarkText = remarkText;
	}

/**	public int getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}
**/
	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
/**
	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	*/

	/**public Section getSection() {
		return this.section;
	}

	public void setSection(Section section) {
		this.section = section;
	}
**/
	public Student getStudent() {
		return this.student;
		
	}
	

	public void setStudent(Student student) {
		this.student = student;
	}

}