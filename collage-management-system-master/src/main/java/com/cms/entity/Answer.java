package com.cms.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the answers database table.
 * 
 */
@Entity
@Table(name="answers")
@NamedQuery(name="Answer.findAll", query="SELECT a FROM Answer a")
public class Answer implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AnswerPK id;

	@Column(name="answer_description", length=255)
	private String answerDescription;

	//bi-directional many-to-one association to Question
	@ManyToOne
	@JoinColumn(name="question_id", nullable=false, insertable=false, updatable=false)
	private Question question;

	public Answer() {
	}

	public AnswerPK getId() {
		return this.id;
	}

	public void setId(AnswerPK id) {
		this.id = id;
	}

	public String getAnswerDescription() {
		return this.answerDescription;
	}

	public void setAnswerDescription(String answerDescription) {
		this.answerDescription = answerDescription;
	}

	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

}