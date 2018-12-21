package com.cms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the student_exams database table.
 * 
 */
@Entity
@Table(name="student_exams")
@NamedQuery(name="StudentExam.findAll", query="SELECT s FROM StudentExam s")
public class StudentExam implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private StudentExamPK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exam_date")
	private Date examDate;

	@Column(length=255)
	private String grade;

	//bi-directional many-to-one association to Student
	@ManyToOne
	@JoinColumn(name="student_id", nullable=false, insertable=false, updatable=false)
	private Student student;

	//bi-directional many-to-one association to Exam
	@ManyToOne
	@JoinColumn(name="exam_id", nullable=false, insertable=false, updatable=false)
	private Exam exam;

	public StudentExam() {
	}

	public StudentExamPK getId() {
		return this.id;
	}

	public void setId(StudentExamPK id) {
		this.id = id;
	}

	public Date getExamDate() {
		return this.examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Exam getExam() {
		return this.exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

}