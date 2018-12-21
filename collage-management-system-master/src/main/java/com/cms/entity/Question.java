package com.cms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the questions database table.
 * 
 */
@Entity
@Table(name="questions")
@NamedQuery(name="Question.findAll", query="SELECT q FROM Question q")
public class Question implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="QUESTIONS_QUESTIONID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="QUESTIONS_QUESTIONID_GENERATOR")
	@Column(name="question_id", unique=true, nullable=false)
	private int questionId;

	@Column(name="correct_answer", length=255)
	private String correctAnswer;

	@Column(name="question_description", length=255)
	private String questionDescription;

	//bi-directional many-to-one association to Answer
	@OneToMany(mappedBy="question")
	private Set<Answer> answers;

	//bi-directional many-to-one association to ExamQuestion
	@OneToMany(mappedBy="question")
	private Set<ExamQuestion> examQuestions;

	public Question() {
	}

	public int getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getCorrectAnswer() {
		return this.correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public String getQuestionDescription() {
		return this.questionDescription;
	}

	public void setQuestionDescription(String questionDescription) {
		this.questionDescription = questionDescription;
	}

	public Set<Answer> getAnswers() {
		return this.answers;
	}

	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}

	public Answer addAnswer(Answer answer) {
		getAnswers().add(answer);
		answer.setQuestion(this);

		return answer;
	}

	public Answer removeAnswer(Answer answer) {
		getAnswers().remove(answer);
		answer.setQuestion(null);

		return answer;
	}

	public Set<ExamQuestion> getExamQuestions() {
		return this.examQuestions;
	}

	public void setExamQuestions(Set<ExamQuestion> examQuestions) {
		this.examQuestions = examQuestions;
	}

	public ExamQuestion addExamQuestion(ExamQuestion examQuestion) {
		getExamQuestions().add(examQuestion);
		examQuestion.setQuestion(this);

		return examQuestion;
	}

	public ExamQuestion removeExamQuestion(ExamQuestion examQuestion) {
		getExamQuestions().remove(examQuestion);
		examQuestion.setQuestion(null);

		return examQuestion;
	}

}