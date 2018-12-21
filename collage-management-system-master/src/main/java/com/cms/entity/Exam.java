package com.cms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the exam database table.
 * 
 */
@Entity
@Table(name="exam")
@NamedQuery(name="Exam.findAll", query="SELECT e FROM Exam e")
public class Exam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EXAM_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EXAM_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="course_id")
	private int courseId;

	@Column(name="exam_type", length=255)
	private String examType;

	@Column(name="final_grade", length=255)
	private String finalGrade;

	@Column(name="instructor_id")
	private int instructorId;

	//bi-directional many-to-one association to ExamQuestion
	@OneToMany(mappedBy="exam")
	private Set<ExamQuestion> examQuestions;

	//bi-directional many-to-one association to StudentExam
	@OneToMany(mappedBy="exam")
	private Set<StudentExam> studentExams;

	public Exam() {
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

	public String getExamType() {
		return this.examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public String getFinalGrade() {
		return this.finalGrade;
	}

	public void setFinalGrade(String finalGrade) {
		this.finalGrade = finalGrade;
	}

	public int getInstructorId() {
		return this.instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public Set<ExamQuestion> getExamQuestions() {
		return this.examQuestions;
	}

	public void setExamQuestions(Set<ExamQuestion> examQuestions) {
		this.examQuestions = examQuestions;
	}

	public ExamQuestion addExamQuestion(ExamQuestion examQuestion) {
		getExamQuestions().add(examQuestion);
		examQuestion.setExam(this);

		return examQuestion;
	}

	public ExamQuestion removeExamQuestion(ExamQuestion examQuestion) {
		getExamQuestions().remove(examQuestion);
		examQuestion.setExam(null);

		return examQuestion;
	}

	public Set<StudentExam> getStudentExams() {
		return this.studentExams;
	}

	public void setStudentExams(Set<StudentExam> studentExams) {
		this.studentExams = studentExams;
	}

	public StudentExam addStudentExam(StudentExam studentExam) {
		getStudentExams().add(studentExam);
		studentExam.setExam(this);

		return studentExam;
	}

	public StudentExam removeStudentExam(StudentExam studentExam) {
		getStudentExams().remove(studentExam);
		studentExam.setExam(null);

		return studentExam;
	}

}