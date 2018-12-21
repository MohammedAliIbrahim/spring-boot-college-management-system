package com.cms.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the exam_questions database table.
 * 
 */
@Entity
@Table(name="exam_questions")
@NamedQuery(name="ExamQuestion.findAll", query="SELECT e FROM ExamQuestion e")
public class ExamQuestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ExamQuestionPK id;

	//bi-directional many-to-one association to Exam
	@ManyToOne
	@JoinColumn(name="exam_id", nullable=false, insertable=false, updatable=false)
	private Exam exam;

	//bi-directional many-to-one association to Question
	@ManyToOne
	@JoinColumn(name="question_id", nullable=false, insertable=false, updatable=false)
	private Question question;

	//bi-directional many-to-one association to StudentExamQuestion
	@ManyToOne
	@JoinColumn(name="exam_id", nullable=false, insertable=false, updatable=false)
	private StudentExamQuestion studentExamQuestion;

	public ExamQuestion() {
	}

	public ExamQuestionPK getId() {
		return this.id;
	}

	public void setId(ExamQuestionPK id) {
		this.id = id;
	}

	public Exam getExam() {
		return this.exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public StudentExamQuestion getStudentExamQuestion() {
		return this.studentExamQuestion;
	}

	public void setStudentExamQuestion(StudentExamQuestion studentExamQuestion) {
		this.studentExamQuestion = studentExamQuestion;
	}

}