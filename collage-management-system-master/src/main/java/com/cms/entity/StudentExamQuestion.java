package com.cms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the student_exam_question database table.
 * 
 */
@Entity
@Table(name="student_exam_question")
@NamedQuery(name="StudentExamQuestion.findAll", query="SELECT s FROM StudentExamQuestion s")
public class StudentExamQuestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="STUDENT_EXAM_QUESTION_EXAMID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STUDENT_EXAM_QUESTION_EXAMID_GENERATOR")
	@Column(name="exam_id", unique=true, nullable=false)
	private int examId;

	@Column(name="answer_id")
	private int answerId;

	@Column(name="question_id")
	private int questionId;

	@Column(name="student_id")
	private int studentId;

	//bi-directional many-to-one association to ExamQuestion
	@OneToMany(mappedBy="studentExamQuestion")
	private Set<ExamQuestion> examQuestions;

	public StudentExamQuestion() {
	}

	public int getExamId() {
		return this.examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public int getAnswerId() {
		return this.answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public int getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Set<ExamQuestion> getExamQuestions() {
		return this.examQuestions;
	}

	public void setExamQuestions(Set<ExamQuestion> examQuestions) {
		this.examQuestions = examQuestions;
	}

	public ExamQuestion addExamQuestion(ExamQuestion examQuestion) {
		getExamQuestions().add(examQuestion);
		examQuestion.setStudentExamQuestion(this);

		return examQuestion;
	}

	public ExamQuestion removeExamQuestion(ExamQuestion examQuestion) {
		getExamQuestions().remove(examQuestion);
		examQuestion.setStudentExamQuestion(null);

		return examQuestion;
	}

}